package exercicio3oo.testes;

import exercicio3oo.classes.Circulo;

public class TestaCirculo {
    public static void main(String[] args) {
        Circulo forma = new Circulo();
        forma.setRaio(18 / 2);
        System.out.printf("Raio do Circulo: [Diametro: 18]\n");
        System.out.printf("\nRaio: " + forma.getRaio());
    }
}
