public class Main {

    public static void Main(String[] args) {

        IFactory fv = (IFactory) new FactoryVeiculo();


        //Só cria objeto para distâncias até 500 km
        IVeiculo veiculo1 = fv.CriarVeiculo(500, 0, null);
        System.out.println(veiculo1.toString());

        //Para até 2 (duas) pessoas criar um Tesla Roadster Eletricidade
        IVeiculo veiculo2 = fv.CriarVeiculo(100, 2, TempoEnum.Chuva);
        System.out.println(veiculo2.toString());

        //Para até 5 (cinco) pessoas e tempo de Sol, criar um Escort Xr3 conversível Alcool (Carro conversível)
        IVeiculo veiculo3 = fv.CriarVeiculo(500, 0, null);
        System.out.println(veiculo3.toString());

        //Para até 5 (cinco) pessoas e tempo de Chuva, criar um Opala a gasolina (Carro convencional)
        IVeiculo veiculo4 = fv.CriarVeiculo(500, 0, null);
        System.out.println(veiculo4.toString());

        //Para mais de 5 (cinco) pessoas e menos de 20 (vinte) pessoas, criar uma Besta a Diesel (Van)
        IVeiculo veiculo5 = fv.CriarVeiculo(500, 0, null);
        System.out.println(veiculo5.toString());
    }
}
