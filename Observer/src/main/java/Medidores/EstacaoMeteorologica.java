package Medidores;

import Clientes.IClienteObserver;

import java.util.ArrayList;
import java.util.List;

public class EstacaoMeteorologica implements IObservable {

    // Lista de clientes do observável
    List<IClienteObserver> clientes = new ArrayList();

    // Informações dos dados meteorológicos
    private DadosMeteorologicos dadosMeteorologicos;

    // Inclui novo cliente no observável
    public void subscribe(IClienteObserver clienteObserver) {
        clientes.add(clienteObserver);
    }

    // Remove um cliente da lista observável
    public void unsubscribe(IClienteObserver clienteObserver) {
        clientes.remove(clienteObserver);
    }

    // Executa uma alteração nos dados meteorológicos
    public void alterarValor(DadosMeteorologicos novoValor) {
        //Altera o valor
        this.dadosMeteorologicos = novoValor;

        //Aciona o método para notificar os clientes
        notificaClientes();
    }

    // Notifica todos os clientes
    public void notificaClientes() {
        for (int i=0; this.clientes.size() >i ; i++){
            clientes.get(i).Notify(this.dadosMeteorologicos);
        }
    }
}
