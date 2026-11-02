package exercicio3oo.testes;

import exercicio3oo.classes.Livro;

public class TestaLivro {
    public static void main(String[] args) {
        Livro romance = new Livro();
        romance.setTitulo("Senhor dos Aneis");
        romance.setAutor("John Ronald Reuel Tolkien");
        romance.setGenero("Fantasia Epica");
        romance.setEmprestado(false);
        System.out.printf("Titulo: " + romance.getTitulo());
        System.out.printf("\nAutor: " + romance.getAutor());
        System.out.printf("\nGenero: " + romance.getGenero());
        if (romance.isEmprestado()) {
            System.out.printf("\nIndisponível");
        } else {
            System.out.printf("\nDisponivel");
        }
    }
}