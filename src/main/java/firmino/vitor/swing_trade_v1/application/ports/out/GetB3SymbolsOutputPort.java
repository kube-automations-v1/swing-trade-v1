package firmino.vitor.swing_trade_v1.application.ports.out;

import java.util.List;

public interface GetB3SymbolsOutputPort {

    List<String> getB3Symbols(String... symbols);
}
