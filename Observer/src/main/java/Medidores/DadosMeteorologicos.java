package Medidores;

public class DadosMeteorologicos {
    private double temperatura;
    private double pressao;
    private double umidade;

    public DadosMeteorologicos(double temperatura, double pressao, double umidade) {
        this.temperatura = temperatura;
        this.pressao = pressao;
        this.umidade = umidade;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getPressao() {
        return pressao;
    }

    public void setPressao(double pressao) {
        this.pressao = pressao;
    }

    public double getUmidade() {
        return umidade;
    }

    public void setUmidade(double umidade) {
        this.umidade = umidade;
    }
}
