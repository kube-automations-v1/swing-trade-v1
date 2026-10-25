package firmino.vitor.swing_trade_v1.application.domain.usecase;

import firmino.vitor.swing_trade_v1.application.ports.in.GetAnalysisInputPort;
import firmino.vitor.swing_trade_v1.application.ports.out.GetB3SymbolsOutputPort;


public class GetAnalysisUseCase implements GetAnalysisInputPort {

    private final GetB3SymbolsOutputPort getB3SymbolsOutputPort;

    public GetAnalysisUseCase(GetB3SymbolsOutputPort getB3SymbolsOutputPort) {
        this.getB3SymbolsOutputPort = getB3SymbolsOutputPort;
    }

    @Override
    public Object get(Object object) {

        getB3SymbolsOutputPort.getB3Symbols("sla");
        return null;
    }

    public record Teste(
            String name,
            String test
    ){}
}


