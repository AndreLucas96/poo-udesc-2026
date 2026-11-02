package exercicio3oo.testes;

import exercicio3oo.classes.ContaBancaria;

public class TestaContaBancaria {
    public static void main(String[] args) {
        ContaBancaria cliente = new ContaBancaria();
        cliente.setNumeroConta("23.485.844-0");
        cliente.setTitular("André Lucas Gwiggner Drun");
        cliente.setSaldo(2.50);
        System.out.printf("Numero da conta: " + cliente.getNumeroConta());
        System.out.printf("\nTitular: " + cliente.getTitular());
        System.out.printf("\nSaldo: R$ " + cliente.getSaldo());
    }
}