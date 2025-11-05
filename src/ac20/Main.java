public class Main {
    public static void main(String[] args) {
        Instrutor instrutor1 = new Instrutor("Ana Lima", "Matemática");
        Instrutor instrutor2 = new Instrutor("Carlos Souza", "Programação");

        Curso curso1 = new Curso("Álgebra Linear", "ALIN", instrutor1);
        Curso curso2 = new Curso("Java Básico", "JAVB", instrutor2);
        Curso curso3 = new Curso("Estrutura de Dados", "ESTD", instrutor2);

        Aluno aluno1 = new Aluno("A001", "João", "joao@email.com");
        Aluno aluno2 = new Aluno("A002", "Maria", "maria@email.com");
        Aluno aluno3 = new Aluno("A003", "Pedro", "pedro@email.com");
        Aluno aluno4 = new Aluno("A004", "Lucia", "lucia@email.com");
        Aluno aluno5 = new Aluno("A005", "Rafael", "rafael@email.com");

        curso1.matricularAluno(aluno1);
        curso1.matricularAluno(aluno2);
        curso2.matricularAluno(aluno2);
        curso2.matricularAluno(aluno3);
        curso2.matricularAluno(aluno4);
        curso3.matricularAluno(aluno1);
        curso3.matricularAluno(aluno5);

        curso1.exibirDetalhes();
        curso2.exibirDetalhes();
        curso3.exibirDetalhes();
    }
}
