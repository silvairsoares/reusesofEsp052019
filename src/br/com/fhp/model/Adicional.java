package br.com.fhp.model;

public abstract class Adicional extends Prato {

    protected Prato prato;

    public Adicional(Prato prato) {
        this.prato = prato;
    }

    abstract public String getDescricao();

}
