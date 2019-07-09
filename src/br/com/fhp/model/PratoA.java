package br.com.fhp.model;

public class PratoA extends Prato {

    public PratoA() {
        descricao = "Prato A";
    }

    @Override
    public double getPreco() {
        return 10.0;
    }
}
