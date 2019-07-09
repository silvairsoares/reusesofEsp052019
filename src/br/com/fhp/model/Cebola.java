package br.com.fhp.model;

public class Cebola extends Adicional{

    public Cebola(Prato prato) {
        super(prato);
    }

    @Override
    public String getDescricao() {
        return " Cebola";
    }

    @Override
    public double getPreco() {
        return prato.getPreco() + 1.0;
    }
}
