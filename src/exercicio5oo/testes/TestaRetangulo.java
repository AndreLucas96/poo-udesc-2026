package exercicio5oo.testes;

import exercicio5oo.classes.Retangulo;

public class TestaRetangulo {
    public static void main(String[] args) {
        Retangulo forma = new Retangulo();
        forma.setLargura(15);
        forma.setAltura(7);
        System.out.printf("Medidas do Retangulo:\n");
        System.out.printf("Largura: " + forma.getLargura());
        System.out.printf("\nAltura: " + forma.getAltura());
        System.out.printf("\nÁrea Retângulo: " + forma.calcularArea() + "\n\n");
        System.out.println(forma);
    }
}
