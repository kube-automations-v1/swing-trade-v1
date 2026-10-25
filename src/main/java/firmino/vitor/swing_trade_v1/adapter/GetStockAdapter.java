package firmino.vitor.swing_trade_v1.adapter;

import java.io.IOException;
import java.util.Calendar;

import firmino.vitor.swing_trade_v1.adapter.out.client.FinanceClient;
import firmino.vitor.swing_trade_v1.application.ports.out.GetStockOutputPort;
import org.springframework.stereotype.Component;
import yahoofinance.Stock;
import yahoofinance.histquotes.Interval;

@Component
public class GetStockAdapter implements GetStockOutputPort {

    private final FinanceClient financeClient;

    public GetStockAdapter(FinanceClient financeClient) {
        this.financeClient = financeClient;
    }

    @Override
    public Stock getStock(String symbol) throws IOException {
        return financeClient.getStock(symbol);
    }

    @Override
    public Stock getStock(String symbol, boolean includeHistorical) throws IOException {
        return financeClient.getStock(symbol, includeHistorical);
    }

    @Override
    public Stock getStock(String symbol, Interval interval) throws IOException {
        return financeClient.getStock(symbol, interval);
    }

    @Override
    public Stock getStock(String symbol, Calendar from) throws IOException {
        return financeClient.getStock(symbol, from);
    }

    @Override
    public Stock getStock(String symbol, Calendar from, Interval interval) throws IOException {
        return financeClient.getStock(symbol, from, interval);
    }

    @Override
    public Stock getStock(String symbol, Calendar from, Calendar to) throws IOException {
        return financeClient.getStock(symbol, from, to);
    }

    @Override
    public Stock getStock(String symbol, Calendar from, Calendar to, Interval interval) throws IOException {
        return financeClient.getStock(symbol, from, to, interval);
    }
}
