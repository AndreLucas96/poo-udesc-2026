package exercicio5oo.classes;

public class Circulo {
    private double raio;
    private static final double RAIO_MINIMO = 0.0;
    private static final double RAIO_MAXIMO = 1000.0;

    public Circulo(){}

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if (raio >= RAIO_MINIMO && raio <= RAIO_MAXIMO) {
            this.raio = raio;
        }
    }

    public double calcularDiametro() {
        return 2 * raio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                '}';
    }
}
