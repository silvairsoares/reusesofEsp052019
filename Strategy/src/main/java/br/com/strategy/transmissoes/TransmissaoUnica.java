package br.com.strategy.transmissoes;

// Plano Básico
public class TransmissaoUnica implements INumeroTransmissoes {
    public int prepararAmbienteParaTransmissoesSimultaneas() {
        return 1;
    }
}