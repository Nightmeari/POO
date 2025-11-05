import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private String sigla;
    private Instrutor instrutor;
    private List<Aluno> alunos;

    public Curso(String nome, String sigla, Instrutor instrutor) {
        this.nome = nome;
        this.sigla = sigla;
        this.instrutor = instrutor;
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public Instrutor getInstrutor() {
        return instrutor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public void matricularAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void exibirDetalhes() {
        System.out.println("\nCurso: " + nome + " (" + sigla + ")");
        System.out.println("Instrutor: " + instrutor);
        System.out.println("Alunos matriculados:");
        for (Aluno a : alunos) {
            System.out.println(" - " + a);
        }
    }
}
