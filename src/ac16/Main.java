public class Main {
    public static void main(String[] args) {
        Artista artista1 = new Artista("Ana", 30);
        Artista artista2 = new Artista("Carlos", 45);
        Artista artista3 = new Artista("Beatriz", 28);

        Evento evento1 = new Evento("Festival de Música", "Praça Central", "10/11/2025");
        Evento evento2 = new Evento("Feira de Artes", "Centro Cultural", "15/11/2025");

        evento1.adicionarArtista(artista1);
        evento1.adicionarArtista(artista2);

        evento2.adicionarArtista(artista2);
        evento2.adicionarArtista(artista3);

        evento1.imprimirResumo();
        evento2.imprimirResumo();
    }
}
