public class ProdutoImportado extends Produto {
    private double taxaImportacao;

    public ProdutoImportado(String nome, double precoBase, double taxaImportacao) {
        super(nome, precoBase);
        this.taxaImportacao = taxaImportacao;
    }

    public double getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(double taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() + taxaImportacao;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Produto Importado: " + getNome());
        System.out.println("Preço base: R$ " + getPrecoBase());
        System.out.println("Taxa de importação: R$ " + taxaImportacao);
        System.out.println("Preço final: R$ " + calcularPrecoFinal());
    }
}
