package exercicio5oo.classes;

public class Aluno {
    public String matricula;
    private String nome;
    private int idade;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private static final double NOTA_MINIMA = 0.0;
    private static final double NOTA_MAXIMA = 10.0;

    public Aluno() {
    }

    public Aluno(String matricula, String nome, int idade, double nota1, double nota2, double nota3, double nota4) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        if (nota1 >= NOTA_MINIMA && nota1 <= NOTA_MAXIMA) {
            this.nota1 = nota1;
        }
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        if (nota2 >= NOTA_MINIMA && nota2 <= NOTA_MAXIMA) {
            this.nota2 = nota2;
        }
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        if (nota3 >= NOTA_MINIMA && nota3 <= NOTA_MAXIMA) {
            this.nota3 = nota3;
        }
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        if (nota4 >= NOTA_MINIMA && nota4 <= NOTA_MAXIMA) {
            this.nota4 = nota4;
        }
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2.0;
    }

    public void imprimirSituacao() {
        if (calcularMedia() >= 7.0) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula='" + matricula + '\'' +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                ", nota4=" + nota4 +
                '}';
    }
}
