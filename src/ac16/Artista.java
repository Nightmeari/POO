import java.util.ArrayList;

public class Artista {
    private String nome;
    private int idade;
    private ArrayList<Evento> eventos;

    public Artista(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.eventos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public ArrayList<Evento> getEventos() {
        return eventos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void adicionarEvento(Evento evento) {
        eventos.add(evento);
    }
}
