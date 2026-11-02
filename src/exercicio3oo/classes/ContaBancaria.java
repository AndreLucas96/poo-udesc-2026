package exercicio3oo.classes;

public class ContaBancaria {
    private String NumeroConta;
    private String Titular;
    private double Saldo;

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
        Saldo = saldo;
    }
}