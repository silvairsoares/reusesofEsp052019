// silvairsoares@outlook.com
public class FactoryVeiculo implements IFactory {

    public IVeiculo CriarVeiculo(int distancia, int qtdPessoas, TempoEnum tempo) {

        boolean cenarioCrise= true;

        if (distancia > 500) {
            //Só cria objeto para distâncias até 500 km
            return null;
        }

        if (cenarioCrise){
            //Extensão do problema: O cenário mudou.
            // Agora os caminhoneiros estão em greve e todo abastecimento de combustível fóssil foi interrompido.
            // O principal critério é o tipo de combustível
            return new VeiculoTeslaRoadster();
        }

        if (qtdPessoas <= 2) {
            //Para até 2 (duas) pessoas criar um Tesla Roadster Eletricidade
            return new VeiculoTeslaRoadster();
        } else if (qtdPessoas <= 5 && tempo == TempoEnum.Sol) {
            //Para até 5 (cinco) pessoas e tempo de Sol, criar um Escort Xr3 conversível Alcool (Carro conversível)
            return new VeiculoEscortXr3();
        } else if (qtdPessoas <= 5 && tempo == TempoEnum.Chuva) {
            //Para até 5 (cinco) pessoas e tempo de Chuva, criar um Opala a gasolina (Carro convencional)
            return new VeiculoOpala();
        } else if (qtdPessoas > 5 && qtdPessoas < 20) {
            //Para mais de 5 (cinco) pessoas e menos de 20 (vinte) pessoas, criar uma Besta a Diesel (Van)
            return new VeiculoBesta();
        }
        return null;
    }
}