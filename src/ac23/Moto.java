public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String modelo, String placa, String fabricante, double valorDiaria, int cilindradas) {
        super(modelo, placa, fabricante, valorDiaria);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
