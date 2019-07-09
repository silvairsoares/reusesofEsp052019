package br.com.fhp.model;

public class App {

    public static void main(String[] args) {
        Prato pratoA = new PratoA();
        System.out.println(pratoA.getDescricao() + "R$: " + pratoA.getPreco());

        Prato ovo = new Ovo(pratoA);
        System.out.println(ovo.getDescricao() + "R$: " + ovo.getPreco());
        ovo = new Ovo(ovo);
        System.out.println(ovo.getDescricao() + "R$: " + ovo.getPreco());

        Prato pratoB = new PratoB();
        System.out.println(pratoB.getDescricao() + "R$: " + pratoB.getPreco());

        Prato cebola = new Cebola(pratoB);
        System.out.println(cebola.getDescricao() + "R$: " + cebola.getPreco());
    }
}
