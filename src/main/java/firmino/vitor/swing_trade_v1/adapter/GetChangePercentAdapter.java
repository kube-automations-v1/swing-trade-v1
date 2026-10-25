package firmino.vitor.swing_trade_v1.adapter;

import java.io.IOException;
import java.math.BigDecimal;

import firmino.vitor.swing_trade_v1.adapter.out.client.FinanceClient;
import firmino.vitor.swing_trade_v1.application.ports.out.GetChangePercentOutputPort;
import org.springframework.stereotype.Component;

@Component
public class GetChangePercentAdapter implements GetChangePercentOutputPort {

    private final FinanceClient financeClient;

    public GetChangePercentAdapter(FinanceClient financeClient) {
        this.financeClient = financeClient;
    }

    @Override
    public BigDecimal getChangePercent(String symbol) throws IOException {
        return financeClient.getChangePercent(symbol);
    }
}
