public class VeiculoTeslaRoadster implements IVeiculo {
    public String getNomeVeiculo() {
        return "TeslaRoadster";
    }

    public TipoVeiculoEnum getTipoVeiculo() {
        return TipoVeiculoEnum.Convencional;
    }

    public CombustivelEnum getCombustivel() {
        return CombustivelEnum.Eletrico;
    }
}
