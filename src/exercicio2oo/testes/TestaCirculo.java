package exercicio2oo.testes;

import exercicio2oo.classes.Circulo;

public class TestaCirculo {
    public static void main (String[] args) {
        Circulo forma = new Circulo();
        forma.raio = 18/2;
        System.out.println("Raio do Circulo: [Diametro: 18]\n");
        System.out.println("Raio: " + forma.raio);
    }
}
