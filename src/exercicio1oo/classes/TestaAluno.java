package exercicio1oo.classes;

public class TestaAluno {
    public static void main (String[] args) {
        Aluno andre = new Aluno();
        andre.matricula = "123";
        andre.nome = "André Lucas Gwiggner Drun";
        andre.idade = 30;
        andre.nota1 = 10;
        andre.nota2 = 9;
        andre.nota3 = 8;
        andre.nota4 = 7;
        System.out.println("Matrícula: " + andre.matricula);
        System.out.println("Nome: " + andre.nome);
        System.out.println("Idade: " + andre.idade);
        System.out.println("Nota 1: " + andre.nota1);
        System.out.println("Nota 2: " + andre.nota2);
        System.out.println("Nota 3: " + andre.nota3);
        System.out.println("Nota 4: " + andre.nota4);
    }
}
