package firmino.vitor.swing_trade_v1.adapter;

import java.io.IOException;

import firmino.vitor.swing_trade_v1.adapter.out.client.FinanceClient;
import firmino.vitor.swing_trade_v1.application.ports.out.GetNameOutputPort;
import org.springframework.stereotype.Component;

@Component
public class GetNameAdapter implements GetNameOutputPort {

    private final FinanceClient financeClient;

    public GetNameAdapter(FinanceClient financeClient) {
        this.financeClient = financeClient;
    }

    @Override
    public String getName(String symbol) throws IOException {
        return financeClient.getName(symbol);
    }
}
