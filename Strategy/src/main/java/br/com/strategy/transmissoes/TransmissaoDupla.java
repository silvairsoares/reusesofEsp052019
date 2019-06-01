package br.com.strategy.transmissoes;

// Plano Padrão
public class TransmissaoDupla implements INumeroTransmissoes {
    public int prepararAmbienteParaTransmissoesSimultaneas() {
        return 2;
    }
}