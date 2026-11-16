package exercicio5oo.classes;

public class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private double velocidade;
    private static final double VELOCIDADE_MINIMA = 0;
    private static final double VELOCIDADE_MAXIMA = 300;
    private static final double VARIACAO_VELOCIDADE = 10;

    public Carro(){}

    public Carro(String modelo, String marca, int ano, double velocidade) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.velocidade = velocidade;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        if (velocidade < VELOCIDADE_MINIMA || velocidade > VELOCIDADE_MAXIMA) {
            return;
        }
        this.velocidade = velocidade;
    }

    public void acelerar() {
        setVelocidade(velocidade + VARIACAO_VELOCIDADE);
    }

    public void frear() {
        setVelocidade(velocidade - VARIACAO_VELOCIDADE);
    }

    public void imprimirVelocidade() {
        System.out.println("Velocidade atual: " + velocidade + " km/h");
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", ano=" + ano +
                ", velocidade=" + velocidade +
                '}';
    }
}
