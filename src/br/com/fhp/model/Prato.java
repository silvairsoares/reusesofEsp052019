package br.com.fhp.model;

public abstract class Prato {

    protected String descricao;

    protected Prato() {
        descricao = "";
    }

    abstract public double getPreco();

    public String getDescricao() {
        return descricao;
    }

}
