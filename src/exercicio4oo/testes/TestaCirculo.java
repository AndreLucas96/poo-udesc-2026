package exercicio4oo.testes;

import exercicio4oo.classes.Circulo;

public class TestaCirculo {
    public static void main(String[] args) {
        Circulo circ = new Circulo();
        circ.setRaio(1.0);
        System.out.printf("Diâmetro: " + circ.calcularDiametro());
        System.out.printf("\nPerímetro: " + circ.calcularPerimetro());
        System.out.printf("\nÁrea Círculo: " + circ.calcularArea());
    }
}
