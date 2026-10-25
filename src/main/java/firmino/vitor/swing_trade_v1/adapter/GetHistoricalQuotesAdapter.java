package firmino.vitor.swing_trade_v1.adapter;

import java.io.IOException;
import java.util.Calendar;
import java.util.List;

import firmino.vitor.swing_trade_v1.adapter.out.client.FinanceClient;
import firmino.vitor.swing_trade_v1.application.ports.out.GetHistoricalQuotesOutputPort;
import org.springframework.stereotype.Component;
import yahoofinance.histquotes.HistoricalQuote;
import yahoofinance.histquotes.Interval;

@Component
public class GetHistoricalQuotesAdapter implements GetHistoricalQuotesOutputPort {

    private final FinanceClient financeClient;

    public GetHistoricalQuotesAdapter(FinanceClient financeClient) {
        this.financeClient = financeClient;
    }

    @Override
    public List<HistoricalQuote> getHistoricalQuotes(String symbol, Calendar from, Calendar to) throws IOException {
        return financeClient.getHistoricalQuotes(symbol, from, to);
    }

    @Override
    public List<HistoricalQuote> getHistoricalQuotes(String symbol, Calendar from, Calendar to, Interval interval) throws IOException {
        return financeClient.getHistoricalQuotes(symbol, from, to, interval);
    }
}
