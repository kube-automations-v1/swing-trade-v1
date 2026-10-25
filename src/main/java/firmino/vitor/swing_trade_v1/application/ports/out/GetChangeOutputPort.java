package firmino.vitor.swing_trade_v1.application.ports.out;

import java.io.IOException;
import java.math.BigDecimal;

public interface GetChangeOutputPort {

    BigDecimal getChange(String symbol) throws IOException;
}
