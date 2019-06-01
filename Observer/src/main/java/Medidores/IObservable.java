package Medidores;

import Clientes.IClienteObserver;

public interface IObservable {

    public void subscribe(IClienteObserver clienteObserver);

    public void unsubscribe(IClienteObserver clienteObserver);

    public void alterarValor(DadosMeteorologicos novoValor);

    public void notificaClientes();
}
