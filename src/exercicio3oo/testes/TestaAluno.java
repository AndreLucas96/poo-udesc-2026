package exercicio3oo.testes;

import exercicio3oo.classes.Aluno;

public class TestaAluno {
    public static void main(String[] args) {
        Aluno andre = new Aluno();
        andre.setMatricula("123");
        andre.setNome("André Lucas Gwiggner Drun");
        andre.setIdade(30);
        andre.setNota1(10);
        andre.setNota2(9);
        andre.setNota3(8);
        andre.setNota4(7);
        System.out.printf("Matrícula: " + andre.getMatricula());
        System.out.printf("\nNome: " + andre.getNome());
        System.out.printf("\nIdade: " + andre.getIdade());
        System.out.printf("\nNota 1: " + andre.getNota1());
        System.out.printf("\nNota 2: " + andre.getNota2());
        System.out.printf("\nNota 3: " + andre.getNota3());
        System.out.printf("\nNota 4: " + andre.getNota4());
    }
}
