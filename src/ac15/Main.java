public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Machado de Assis", "123.456.789-00");

        Livro livro1 = new Livro("Dom Casmurro", 256);
        Livro livro2 = new Livro("Memórias Póstumas de Brás Cubas", 198);

        autor.adicionarLivro(livro1);
        autor.adicionarLivro(livro2);

        autor.imprimirResumoObras();
    }
}
