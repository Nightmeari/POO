public class Carro extends Veiculo {
    private int quantidadePortas;

    public Carro(String modelo, String placa, String fabricante, double valorDiaria, int quantidadePortas) {
        super(modelo, placa, fabricante, valorDiaria);
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }
}
