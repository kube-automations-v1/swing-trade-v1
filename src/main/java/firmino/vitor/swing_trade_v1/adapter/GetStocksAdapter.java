package firmino.vitor.swing_trade_v1.adapter;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import firmino.vitor.swing_trade_v1.adapter.out.client.FinanceClient;
import firmino.vitor.swing_trade_v1.application.ports.out.GetStocksOutputPort;
import org.springframework.stereotype.Component;
import yahoofinance.Stock;

@Component
public class GetStocksAdapter implements GetStocksOutputPort {

    private final FinanceClient financeClient;

    public GetStocksAdapter(FinanceClient financeClient) {
        this.financeClient = financeClient;
    }

    @Override
    public Map<String, Stock> getStocks(String... symbols) throws IOException {
        return financeClient.getStocks(symbols);
    }

    @Override
    public Map<String, Stock> getStocks(List<String> symbols) throws IOException {
        return financeClient.getStocks(symbols);
    }
}
