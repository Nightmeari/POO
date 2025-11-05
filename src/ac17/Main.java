public class Main {
    public static void main(String[] args) {
        Produto produtoSimples = new Produto("Caneta", 2.50);
        ProdutoImportado produtoImportado = new ProdutoImportado("Notebook", 3000.00, 500.00);
        ProdutoComServico produtoServico = new ProdutoComServico("Instalação de software", 200.00, 0.15);

        produtoSimples.exibirInformacoes();
        System.out.println();

        produtoImportado.exibirInformacoes();
        System.out.println();

        produtoServico.exibirInformacoes();
    }
}
