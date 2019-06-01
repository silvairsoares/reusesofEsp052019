package br.com.strategy.transmissoes;

// Plano Premium
public class TransmissaoQuadrupla implements INumeroTransmissoes {
    public int prepararAmbienteParaTransmissoesSimultaneas() {
        return 4;
    }
}