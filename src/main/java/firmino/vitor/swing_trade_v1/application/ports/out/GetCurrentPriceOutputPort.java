package firmino.vitor.swing_trade_v1.application.ports.out;

import java.io.IOException;
import java.math.BigDecimal;

public interface GetCurrentPriceOutputPort {

    BigDecimal getCurrentPrice(String symbol) throws IOException;
}
