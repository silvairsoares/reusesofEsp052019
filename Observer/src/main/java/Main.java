import Clientes.ClienteObserver;
import Clientes.IClienteObserver;
import Medidores.DadosMeteorologicos;
import Medidores.IObservable;
import Medidores.EstacaoMeteorologica;

public class Main {
    public static void main(String[] args) {
        // Novo objeto observável
        IObservable estacaoMeteorologica = new EstacaoMeteorologica();

        // Cria os clientes do observável
        IClienteObserver cliente1 = new ClienteObserver("Google");
        IClienteObserver cliente2 = new ClienteObserver("Microsoft");
        IClienteObserver cliente3 = new ClienteObserver("Apple");
        IClienteObserver cliente4 = new ClienteObserver("Cliente que será removido");

        // Adiciona os clientes aos observers
        estacaoMeteorologica.subscribe(cliente1);
        estacaoMeteorologica.subscribe(cliente2);
        estacaoMeteorologica.subscribe(cliente3);
        estacaoMeteorologica.subscribe(cliente4);

        // Primeira alteração de valores
        System.out.println(" -------------- Primeira alteração de dados meteorológicos --------------");
        estacaoMeteorologica.alterarValor(new DadosMeteorologicos(100d,200d,300d));

        // Remove o cliente4
        estacaoMeteorologica.unsubscribe(cliente4);

        // Segunda alteração de valores
        System.out.println("-------------- Segunda alteração de dados meteorológicos --------------");
        estacaoMeteorologica.alterarValor(new DadosMeteorologicos(400d,600d,700d));
    }
}
