public abstract class Carro {
    private String descricao;
    private double valor;
    private int kmAtual;
    protected final int LIMITE_KM = 50000;

    public Carro(String descricao, double valor, int kmAtual) {
        this.descricao = descricao;
        this.valor = valor;
        this.kmAtual = kmAtual;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public int getKmAtual() {
        return kmAtual;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setKmAtual(int kmAtual) {
        this.kmAtual = kmAtual;
    }

    public abstract double calcularDiaria();

    public abstract void verificarKm();

    public void exibirInformacoes() {
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor do carro: R$ " + valor);
        System.out.println("Quilometragem atual: " + kmAtual + " km");
        System.out.println("Valor da diária: R$ " + calcularDiaria());
        verificarKm();
        System.out.println();
    }
}
