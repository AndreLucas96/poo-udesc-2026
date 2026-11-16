package exercicio5oo.testes;

import exercicio5oo.classes.Carro;

public class TestaCarro {
    public static void main(String[] args) {
        Carro Tracker = new Carro();
        Tracker.setModelo("Tracker LT");
        Tracker.setMarca("Chevrolet");
        Tracker.setAno(2025);
        Tracker.setVelocidade(177);
        System.out.printf("Modelo: " + Tracker.getModelo());
        System.out.printf("\nMarca: " + Tracker.getMarca());
        System.out.printf("\nAno: " + Tracker.getAno());
        System.out.printf("\nVelocidade Max: " + Tracker.getVelocidade());
        Tracker.acelerar();
        Tracker.acelerar();
        Tracker.imprimirVelocidade();
        Tracker.frear();
        Tracker.imprimirVelocidade();
        System.out.println(Tracker);
    }
}