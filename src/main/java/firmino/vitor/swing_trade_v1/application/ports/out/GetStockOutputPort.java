package firmino.vitor.swing_trade_v1.application.ports.out;

import java.io.IOException;
import java.util.Calendar;
import yahoofinance.Stock;
import yahoofinance.histquotes.Interval;

public interface GetStockOutputPort {

    Stock getStock(String symbol) throws IOException;

    Stock getStock(String symbol, boolean includeHistorical) throws IOException;

    Stock getStock(String symbol, Interval interval) throws IOException;

    Stock getStock(String symbol, Calendar from) throws IOException;

    Stock getStock(String symbol, Calendar from, Interval interval) throws IOException;

    Stock getStock(String symbol, Calendar from, Calendar to) throws IOException;

    Stock getStock(String symbol, Calendar from, Calendar to, Interval interval) throws IOException;
}
