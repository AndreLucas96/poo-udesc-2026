package exercicio1oo.classes;

public class TestaContaBancaria {
    public static void main (String[] args) {
        ContaBancaria cliente = new ContaBancaria();
        cliente.NumeroConta = "23.485.844-0";
        cliente.Titular = "André Lucas Gwiggner Drun";
        cliente.Saldo = 2.50;
        System.out.println("Numero da conta: " + cliente.NumeroConta);
        System.out.println("Titular: " + cliente.Titular);
        System.out.println("\nSaldo: R$ " + cliente.Saldo);
    }
}