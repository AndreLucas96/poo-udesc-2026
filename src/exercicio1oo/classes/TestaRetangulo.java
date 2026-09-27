package exercicio1oo.classes;

public class TestaRetangulo {
    public static void main (String[] args) {
        Retangulo forma = new Retangulo();
        forma.largura = 15;
        forma.altura = 7;
        System.out.println("Medidas do Retangulo:\n");
        System.out.println("Largura: " + forma.largura);
        System.out.println("Altura: " + forma.altura);
    }
}
