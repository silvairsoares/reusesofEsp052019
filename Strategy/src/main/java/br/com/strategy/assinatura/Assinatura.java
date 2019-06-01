package br.com.strategy.assinatura;

import br.com.strategy.qualidade.IContentTransformer;
import br.com.strategy.qualidade.Streaming;
import br.com.strategy.transmissoes.INumeroTransmissoes;

public class Assinatura {

    // Atributos
    private IPreco preco;
    private IContentTransformer qualidade;
    private INumeroTransmissoes numeroLimite;

    // Construtor
    public Assinatura(IPreco preco, IContentTransformer qualidade,INumeroTransmissoes numeroLimite){
        this.preco = preco;
        this.qualidade = qualidade;
        this.numeroLimite = numeroLimite;
    }

    public double getPreco() {
        return preco.getCalculaPreco();
    }

    public Streaming getQualidade() {
        return qualidade.converterQualidade();
    }

    public int getNumeroLimite() {
        return numeroLimite.prepararAmbienteParaTransmissoesSimultaneas();
    }
}