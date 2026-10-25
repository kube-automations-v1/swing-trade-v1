package firmino.vitor.swing_trade_v1.adapter;

import java.util.List;

import firmino.vitor.swing_trade_v1.adapter.out.client.FinanceClient;
import firmino.vitor.swing_trade_v1.application.ports.out.GetB3SymbolsOutputPort;
import org.springframework.stereotype.Component;

@Component
public class GetB3SymbolsAdapter implements GetB3SymbolsOutputPort {

    private final FinanceClient financeClient;

    public GetB3SymbolsAdapter(FinanceClient financeClient) {
        this.financeClient = financeClient;
    }

    @Override
    public List<String> getB3Symbols(String... symbols) {
        return financeClient.getB3Symbols(symbols);
    }
}
