package br.com.fhp.model;

public class PratoB extends Prato {

    public PratoB() {
        descricao = "Prato B";
    }

    @Override
    public double getPreco() {
        return 12.0;
    }
}
