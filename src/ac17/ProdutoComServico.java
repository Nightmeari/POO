public class ProdutoComServico extends Produto {
    private double taxaServico;

    public ProdutoComServico(String nome, double precoBase, double taxaServico) {
        super(nome, precoBase);
        this.taxaServico = taxaServico;
    }

    public double getTaxaServico() {
        return taxaServico;
    }

    public void setTaxaServico(double taxaServico) {
        this.taxaServico = taxaServico;
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() + (getPrecoBase() * taxaServico);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Produto com Serviço: " + getNome());
        System.out.println("Preço base: R$ " + getPrecoBase());
        System.out.println("Taxa de serviço: " + (taxaServico * 100) + "%");
        System.out.println("Preço final: R$ " + calcularPrecoFinal());
    }
}
