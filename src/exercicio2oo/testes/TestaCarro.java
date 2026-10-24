package exercicio2oo.testes;

import exercicio2oo.classes.Carro;

public class TestaCarro {
    public static void main (String[] args) {
        Carro Tracker = new Carro();
        Tracker.modelo = "Tracker LT";
        Tracker.marca = "Chevrolet";
        Tracker.ano = 2025;
        Tracker.velocidade = 177;
        System.out.println("Modelo: " + Tracker.modelo);
        System.out.println("Marca: " + Tracker.marca);
        System.out.println("Ano: " + Tracker.ano);
        System.out.println("Velocidade Max: " + Tracker.velocidade);
    }
}