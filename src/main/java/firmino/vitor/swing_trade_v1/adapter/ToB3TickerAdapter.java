package firmino.vitor.swing_trade_v1.adapter;

import firmino.vitor.swing_trade_v1.adapter.out.client.FinanceClient;
import firmino.vitor.swing_trade_v1.application.ports.out.ToB3TickerOutputPort;
import org.springframework.stereotype.Component;

@Component
public class ToB3TickerAdapter implements ToB3TickerOutputPort {

    private final FinanceClient financeClient;

    public ToB3TickerAdapter(FinanceClient financeClient) {
        this.financeClient = financeClient;
    }

    @Override
    public String toB3Ticker(String symbol) {
        return financeClient.toB3Ticker(symbol);
    }
}
