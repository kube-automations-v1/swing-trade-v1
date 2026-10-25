package firmino.vitor.swing_trade_v1.application.ports.out;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import yahoofinance.Stock;

public interface GetStocksOutputPort {

    Map<String, Stock> getStocks(String... symbols) throws IOException;

    Map<String, Stock> getStocks(List<String> symbols) throws IOException;
}
