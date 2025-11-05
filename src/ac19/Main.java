public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("C001", "INF", "Informática");

        Aluno a1 = new Aluno("João", "A001");
        Aluno a2 = new Aluno("Maria", "A002");
        Aluno a3 = new Aluno("Pedro", "A003");

        curso.adicionarAluno(a1);
        curso.adicionarAluno(a2);
        curso.adicionarAluno(a3);
        curso.adicionarAluno(new Aluno("João duplicado", "A001")); // teste de duplicidade

        curso.listarAlunos();

        System.out.println("\nBuscando aluno A002:");
        Aluno encontrado = curso.buscarAluno("A002");
        if (encontrado != null) {
            System.out.println("Encontrado: " + encontrado);
        }

        curso.removerAluno("A002");
        curso.listarAlunos();
    }
}
