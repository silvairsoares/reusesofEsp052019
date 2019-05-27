public enum CombustivelEnum {
    ALCOOL(1, "Alcool"),
    GASOLINA(2, "Gasolina");
    private Integer codigo;
    private String descricao;

    CombustivelEnum(Integer codigo, String desc) {
        this.codigo = codigo;
        this.descricao = desc;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }


}