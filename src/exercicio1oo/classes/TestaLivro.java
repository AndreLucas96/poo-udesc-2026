package exercicio1oo.classes;

public class TestaLivro {
    public static void main (String[] args) {
        Livro romance = new Livro();
        romance.titulo = "Senhor dos Aneis";
        romance.autor = "John Ronald Reuel Tolkien";
        romance.genero = "Fantasia Epica";
        romance.emprestado = false;
        System.out.println("Titulo: " + romance.titulo);
        System.out.println("Autor: " + romance.autor);
        System.out.println("Genero: " + romance.genero);
        if (romance.emprestado == true){
            System.out.println("Indisponível");
        } else {
            System.out.println("Disponivel");
        }
    }
}