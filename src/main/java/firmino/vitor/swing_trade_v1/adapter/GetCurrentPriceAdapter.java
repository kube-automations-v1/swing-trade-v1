package firmino.vitor.swing_trade_v1.adapter;

import java.io.IOException;
import java.math.BigDecimal;

import firmino.vitor.swing_trade_v1.adapter.out.client.FinanceClient;
import firmino.vitor.swing_trade_v1.application.ports.out.GetCurrentPriceOutputPort;
import org.springframework.stereotype.Component;

@Component
public class GetCurrentPriceAdapter implements GetCurrentPriceOutputPort {

    private final FinanceClient financeClient;

    public GetCurrentPriceAdapter(FinanceClient financeClient) {
        this.financeClient = financeClient;
    }

    @Override
    public BigDecimal getCurrentPrice(String symbol) throws IOException {
        return financeClient.getCurrentPrice(symbol);
    }
}
