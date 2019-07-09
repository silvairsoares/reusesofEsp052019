package br.com.fhp.model;

public class Ovo extends Adicional {

    public Ovo(Prato prato) {
        super(prato);
    }

    @Override
    public String getDescricao() {
        return " Ovo";
    }

    @Override
    public double getPreco() {
        return prato.getPreco() + 1.50;
    }
}
