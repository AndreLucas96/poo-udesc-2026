package exercicio5oo.classes;

public class ContaBancaria {
    private String NumeroConta;
    private String Titular;
    private double Saldo;
    private static final double VALOR_MINIMO = 0.0;

    public ContaBancaria() {
    }

    public ContaBancaria(String numeroConta, String titular, double saldo) {
        NumeroConta = numeroConta;
        Titular = titular;
        Saldo = saldo;
    }

    public String getNumeroConta() {
        return NumeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        NumeroConta = numeroConta;
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String titular) {
        Titular = titular;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo > VALOR_MINIMO) {
            this.Saldo = saldo;
        }
    }

    public void depositar(double valor) {
        if (valor > VALOR_MINIMO) {
            Saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > VALOR_MINIMO && valor <= Saldo) {
            Saldo -= valor;
        }
    }

    public void imprimirSaldo() {
        System.out.println("Saldo atual: R$ " + Saldo);
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "NumeroConta='" + NumeroConta + '\'' +
                ", Titular='" + Titular + '\'' +
                ", Saldo=" + Saldo +
                '}';
    }
}