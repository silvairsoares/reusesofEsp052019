public class VeiculoEscortXr3 implements IVeiculo {
    public String getNomeVeiculo() {
        return "Escort Xr3";
    }

    public TipoVeiculoEnum getTipoVeiculo() {
        return TipoVeiculoEnum.Convencional;
    }

    public CombustivelEnum getCombustivel() {
        return CombustivelEnum.Alcool;
    }
}