package firmino.vitor.swing_trade_v1.adapter;

import java.io.IOException;
import java.math.BigDecimal;

import firmino.vitor.swing_trade_v1.adapter.out.client.FinanceClient;
import firmino.vitor.swing_trade_v1.application.ports.out.GetPreviousCloseOutputPort;
import org.springframework.stereotype.Component;

@Component
public class GetPreviousCloseAdapter implements GetPreviousCloseOutputPort {

    private final FinanceClient financeClient;

    public GetPreviousCloseAdapter(FinanceClient financeClient) {
        this.financeClient = financeClient;
    }

    @Override
    public BigDecimal getPreviousClose(String symbol) throws IOException {
        return financeClient.getPreviousClose(symbol);
    }
}
