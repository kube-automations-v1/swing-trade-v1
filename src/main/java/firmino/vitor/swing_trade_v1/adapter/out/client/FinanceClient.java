package firmino.vitor.swing_trade_v1.adapter.out.client;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;
import yahoofinance.histquotes.HistoricalQuote;
import yahoofinance.histquotes.Interval;

@Component
public class FinanceClient {

    public static final String B3_SUFFIX = ".SA";

    public String toB3Ticker(String symbol) {
        if (symbol == null || symbol.isBlank()) {
            throw new IllegalArgumentException("Ticker da ação deve ser informado.");
        }

        String normalized = symbol.trim().toUpperCase();
        normalized = normalized.replace("B3:", "");
        normalized = normalized.replace("^", "");
        normalized = normalized.replace(" ", "");

        if (normalized.endsWith(B3_SUFFIX)) {
            return normalized;
        }

        return normalized + B3_SUFFIX;
    }

    public Stock getStock(String symbol) throws IOException {
        return YahooFinance.get(toB3Ticker(symbol));
    }

    public Stock getStock(String symbol, boolean includeHistorical) throws IOException {
        return YahooFinance.get(toB3Ticker(symbol), includeHistorical);
    }

    public Stock getStock(String symbol, Interval interval) throws IOException {
        return YahooFinance.get(toB3Ticker(symbol), interval);
    }

    public Stock getStock(String symbol, Calendar from) throws IOException {
        return YahooFinance.get(toB3Ticker(symbol), from);
    }

    public Stock getStock(String symbol, Calendar from, Interval interval) throws IOException {
        return YahooFinance.get(toB3Ticker(symbol), from, interval);
    }

    public Stock getStock(String symbol, Calendar from, Calendar to) throws IOException {
        return YahooFinance.get(toB3Ticker(symbol), from, to);
    }

    public Stock getStock(String symbol, Calendar from, Calendar to, Interval interval) throws IOException {
        return YahooFinance.get(toB3Ticker(symbol), from, to, interval);
    }

    public Map<String, Stock> getStocks(String... symbols) throws IOException {
        if (symbols == null || symbols.length == 0) {
            return Map.of();
        }

        String[] b3Tickers = Arrays.stream(symbols)
                .filter(Objects::nonNull)
                .map(this::toB3Ticker)
                .toArray(String[]::new);

        return YahooFinance.get(b3Tickers);
    }

    public Map<String, Stock> getStocks(List<String> symbols) throws IOException {
        if (symbols == null || symbols.isEmpty()) {
            return Map.of();
        }

        return getStocks(symbols.toArray(String[]::new));
    }

    public List<HistoricalQuote> getHistoricalQuotes(String symbol, Calendar from, Calendar to) throws IOException {
        return YahooFinance.get(toB3Ticker(symbol), from, to).getHistory();
    }

    public List<HistoricalQuote> getHistoricalQuotes(String symbol, Calendar from, Calendar to, Interval interval)
            throws IOException {
        return YahooFinance.get(toB3Ticker(symbol), from, to, interval).getHistory();
    }

    public BigDecimal getCurrentPrice(String symbol) throws IOException {
        Stock stock = getStock(symbol);
        return stock == null || stock.getQuote() == null ? null : stock.getQuote().getPrice();
    }

    public BigDecimal getPreviousClose(String symbol) throws IOException {
        Stock stock = getStock(symbol);
        return stock == null || stock.getQuote() == null ? null : stock.getQuote().getPreviousClose();
    }

    public BigDecimal getChange(String symbol) throws IOException {
        Stock stock = getStock(symbol);
        return stock == null || stock.getQuote() == null ? null : stock.getQuote().getChange();
    }

    public BigDecimal getChangePercent(String symbol) throws IOException {
        Stock stock = getStock(symbol);
        return stock == null || stock.getQuote() == null ? null : stock.getQuote().getChangeInPercent();
    }

    public String getName(String symbol) throws IOException {
        Stock stock = getStock(symbol);
        return stock == null ? null : stock.getName();
    }

    public List<String> getB3Symbols(String... symbols) {
        if (symbols == null || symbols.length == 0) {
            return List.of();
        }

        return Arrays.stream(symbols)
                .filter(Objects::nonNull)
                .map(this::toB3Ticker)
                .collect(Collectors.toList());
    }
}
