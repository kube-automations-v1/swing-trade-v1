package firmino.vitor.swing_trade_v1.application.ports.out;

import firmino.vitor.swing_trade_v1.application.domain.usecase.GetAnalysisUseCase;

import java.io.IOException;
import java.math.BigDecimal;

public interface GetPreviousCloseOutputPort {

   BigDecimal getPreviousClose(String symbol) throws IOException;

}

