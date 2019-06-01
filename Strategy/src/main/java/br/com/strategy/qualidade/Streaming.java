package br.com.strategy.qualidade;

import br.com.strategy.qualidade.IContentTransformer;

public class Streaming {
    public Streaming(IContentTransformer conteudo) {
        // Devolve o conteúdo convertido para a qualidade
        conteudo.converterQualidade();
    }
}