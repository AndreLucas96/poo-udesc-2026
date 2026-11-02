package exercicio3oo.testes;

import exercicio3oo.classes.Retangulo;

public class TestaRetangulo {
    public static void main(String[] args) {
        Retangulo forma = new Retangulo();
        forma.setLargura(15);
        forma.setAltura(7);
        System.out.printf("Medidas do Retangulo:\n");
        System.out.printf("Largura: " + forma.getLargura());
        System.out.printf("Altura: " + forma.getAltura());
    }
}
