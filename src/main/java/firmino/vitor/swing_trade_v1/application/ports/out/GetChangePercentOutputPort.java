package firmino.vitor.swing_trade_v1.application.ports.out;

import java.io.IOException;
import java.math.BigDecimal;

public interface GetChangePercentOutputPort {

    BigDecimal getChangePercent(String symbol) throws IOException;
}
