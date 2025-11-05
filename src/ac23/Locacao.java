import java.time.LocalDate;

public class Locacao {
    private int id;
    private LocalDate dataLocacao;
    private LocalDate dataDevolucao;
    private int dias;
    private double valorFinal;
    private Cliente cliente;
    private Veiculo veiculo;

    public Locacao(int id, LocalDate dataLocacao, LocalDate dataDevolucao, Cliente cliente, Veiculo veiculo) {
        this.id = id;
        this.dataLocacao = dataLocacao;
        this.dataDevolucao = dataDevolucao;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.dias = (int) java.time.temporal.ChronoUnit.DAYS.between(dataLocacao, dataDevolucao);
        this.valorFinal = dias * veiculo.getValorDiaria();

        cliente.adicionarLocacao(this);
        veiculo.adicionarLocacao(this);
    }

    public int getId() {
        return id;
    }

    public LocalDate getDataLocacao() {
        return dataLocacao;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public int getDias() {
        return dias;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setDataDevolucao(LocalDate novaData) {
        this.dataDevolucao = novaData;
        this.dias = (int) java.time.temporal.ChronoUnit.DAYS.between(dataLocacao, novaData);
        this.valorFinal = dias * veiculo.getValorDiaria();
    }
}
