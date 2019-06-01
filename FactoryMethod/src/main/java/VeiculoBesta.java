public class VeiculoBesta implements IVeiculo {
    public String getNomeVeiculo() {
        return "Besta";
    }

    public TipoVeiculoEnum getTipoVeiculo() {
        return TipoVeiculoEnum.Van;
    }

    public CombustivelEnum getCombustivel() {
        return CombustivelEnum.Diesel;
    }
}
