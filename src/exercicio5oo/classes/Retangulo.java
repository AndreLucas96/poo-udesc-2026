package exercicio5oo.classes;

public class Retangulo {
    private double largura;
    private double altura;
    private static final double VALOR_MINIMO = 0.0;
    private static final double VALOR_MAXIMO = 1000.0;

    public Retangulo() {
    }

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura < VALOR_MINIMO || largura > VALOR_MAXIMO) {
            return;
        }
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura < VALOR_MINIMO || altura > VALOR_MAXIMO) {
            return;
        }
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "largura=" + largura +
                ", altura=" + altura +
                '}';
    }
}
