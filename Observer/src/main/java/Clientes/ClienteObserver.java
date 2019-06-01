package Clientes;

import Medidores.DadosMeteorologicos;

public class ClienteObserver implements IClienteObserver {

    private String nomeCliente;

    public ClienteObserver(String nome){
        this.nomeCliente = nome;
    }

    public void Notify(DadosMeteorologicos valorNovo) {
        System.out.println("Cliente " + getNomeDliente() + " | Novo valor da Pressão: " + valorNovo.getPressao());
        System.out.println("Cliente " + getNomeDliente() + " | Novo valor da Temperatura: " + valorNovo.getTemperatura());
        System.out.println("Cliente " + getNomeDliente() + " | Novo valor da Umidade: " + valorNovo.getUmidade());
        System.out.println("");
    }

    public String getNomeDliente() {
        return nomeCliente;
    }
}
