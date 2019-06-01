public interface IFactory {
    IVeiculo CriarVeiculo(int distancia, int qtdPessoas, TempoEnum tempo);
}
