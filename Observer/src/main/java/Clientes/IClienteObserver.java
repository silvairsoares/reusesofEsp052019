package Clientes;

import Medidores.DadosMeteorologicos;

public interface IClienteObserver {
    public void Notify(DadosMeteorologicos valorNovo);
}
