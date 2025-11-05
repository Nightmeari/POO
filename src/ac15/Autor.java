import java.util.ArrayList;

public class Autor {
    private String nome;
    private String cpf;
    private ArrayList<Livro> livros;

    public Autor(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.livros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void imprimirResumoObras() {
        System.out.println("Autor: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Obras:");
        for (Livro livro : livros) {
            System.out.println("- " + livro.getDescricao() + " (" + livro.getNumeroPaginas() + " páginas)");
        }
    }
}
