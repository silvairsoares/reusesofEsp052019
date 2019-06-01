package br.com.strategy;

import br.com.strategy.assinatura.Assinatura;
import br.com.strategy.transmissoes.INumeroTransmissoes;
import br.com.strategy.assinatura.IPreco;
import br.com.strategy.assinatura.PrecoBasico;
import br.com.strategy.qualidade.IContentTransformer;
import br.com.strategy.qualidade.Simples;
import br.com.strategy.transmissoes.TransmissaoUnica;

public class Main {
    public static void main(String[] args) {

    // Plano básico
        IPreco preco = new PrecoBasico();
        IContentTransformer qualidade = new Simples();
        INumeroTransmissoes numeroLimite = new TransmissaoUnica();

        Assinatura planoBasico = new Assinatura(preco, qualidade, numeroLimite);

        System.out.println(planoBasico.getPreco());

    }
}