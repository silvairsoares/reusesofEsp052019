public class VeiculoOpala implements IVeiculo {

    public String getNomeVeiculo() {
        return "Opala";
    }

    public TipoVeiculoEnum getTipoVeiculo() {
        return TipoVeiculoEnum.Convencional;
    }

    public CombustivelEnum getCombustivel() {
        return CombustivelEnum.Gasolina;
    }
}
