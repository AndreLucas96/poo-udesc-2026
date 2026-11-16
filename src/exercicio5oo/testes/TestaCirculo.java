package exercicio5oo.testes;

import exercicio5oo.classes.Circulo;

public class TestaCirculo {
    public static void main(String[] args) {
        Circulo circ = new Circulo();
        circ.setRaio(5.0);
        System.out.printf("Diâmetro: " + circ.calcularDiametro());
        System.out.printf("\nPerímetro: " + circ.calcularPerimetro());
        System.out.printf("\nÁrea Círculo: " + circ.calcularArea() + "\n\n");
        System.out.println(circ);
    }
}
