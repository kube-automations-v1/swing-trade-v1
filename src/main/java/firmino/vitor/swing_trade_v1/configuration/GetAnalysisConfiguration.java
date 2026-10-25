package firmino.vitor.swing_trade_v1.configuration;

import firmino.vitor.swing_trade_v1.application.domain.usecase.GetAnalysisUseCase;
import firmino.vitor.swing_trade_v1.application.ports.in.GetAnalysisInputPort;
import firmino.vitor.swing_trade_v1.application.ports.out.GetB3SymbolsOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GetAnalysisConfiguration {

    @Bean
    public GetAnalysisInputPort getAnalysisBeanConfiguration(GetB3SymbolsOutputPort getB3SymbolsOutputPort){
        return new GetAnalysisUseCase(getB3SymbolsOutputPort);
    }

}
