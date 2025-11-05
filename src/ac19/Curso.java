import java.util.HashMap;
import java.util.Map;

public class Curso {
    private String id;
    private String sigla;
    private String nome;
    private Map<String, Aluno> alunos = new HashMap<>();

    public Curso(String id, String sigla, String nome) {
        this.id = id;
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean adicionarAluno(Aluno aluno) {
        if (alunos.containsKey(aluno.getMatricula())) {
            System.out.println("Aluno com matrícula " + aluno.getMatricula() + " já está cadastrado.");
            return false;
        }
        alunos.put(aluno.getMatricula(), aluno);
        System.out.println("Aluno adicionado: " + aluno.getNome());
        return true;
    }

    public boolean removerAluno(String matricula) {
        if (alunos.remove(matricula) != null) {
            System.out.println("Aluno removido: " + matricula);
            return true;
        } else {
            System.out.println("Aluno com matrícula " + matricula + " não encontrado.");
            return false;
        }
    }

    public Aluno buscarAluno(String matricula) {
        return alunos.get(matricula);
    }

    public void listarAlunos() {
        System.out.println("\n--- Alunos do curso " + nome + " ---");
        for (Aluno aluno : alunos.values()) {
            System.out.println(aluno);
        }
    }
}
