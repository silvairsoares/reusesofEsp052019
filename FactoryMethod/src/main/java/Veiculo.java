public class Veiculo implements IVeiculo {

    // Atributos
    private CombustivelEnum combustivel;
    private TipoVeiculoEnum tipoVeiculo;
    private String nomeVeiculo;

    // Construtor
    public Veiculo(CombustivelEnum combustivel, TipoVeiculoEnum tipoVeiculo, String nomeVeiculo) {
        this.combustivel = combustivel;
        this.tipoVeiculo = tipoVeiculo;
        this.nomeVeiculo = nomeVeiculo;
    }

    // Getters
    public CombustivelEnum getCombustivel() {
        return combustivel;
    }

    public TipoVeiculoEnum getTipoVeiculo() {
        return tipoVeiculo;
    }

    public String getNomeVeiculo() {
        return nomeVeiculo;
    }

    public String ToString() {
        return "Nome: " + nomeVeiculo + "/n" +
               "Tipo: " + tipoVeiculo + "/n" +
               "Combustível: " + nomeVeiculo + "/n";
    }
}