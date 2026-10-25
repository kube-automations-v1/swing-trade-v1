package firmino.vitor.swing_trade_v1.application.ports.out;

import java.io.IOException;
import java.util.Calendar;
import java.util.List;
import yahoofinance.histquotes.HistoricalQuote;
import yahoofinance.histquotes.Interval;

public interface GetHistoricalQuotesOutputPort {

    List<HistoricalQuote> getHistoricalQuotes(String symbol, Calendar from, Calendar to) throws IOException;

    List<HistoricalQuote> getHistoricalQuotes(String symbol, Calendar from, Calendar to, Interval interval) throws IOException;
}
