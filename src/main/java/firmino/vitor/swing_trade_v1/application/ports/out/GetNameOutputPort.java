package firmino.vitor.swing_trade_v1.application.ports.out;

import java.io.IOException;

public interface GetNameOutputPort {

    String getName(String symbol) throws IOException;
}
