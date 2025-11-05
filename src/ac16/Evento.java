import java.util.ArrayList;

public class Evento {
    private String nome;
    private String local;
    private String data;
    private ArrayList<Artista> artistas;

    public Evento(String nome, String local, String data) {
        this.nome = nome;
        this.local = local;
        this.data = data;
        this.artistas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getLocal() {
        return local;
    }

    public String getData() {
        return data;
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void adicionarArtista(Artista artista) {
        artistas.add(artista);
        artista.adicionarEvento(this); // vincula o evento ao artista também
    }

    public void imprimirResumo() {
        System.out.println("Evento: " + nome);
        System.out.println("Local: " + local);
        System.out.println("Data: " + data);
        System.out.println("Artistas participantes:");
        for (Artista artista : artistas) {
            System.out.println("- " + artista.getNome() + " (" + artista.getIdade() + " anos)");
        }
        System.out.println();
    }
}
