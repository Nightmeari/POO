import java.util.ArrayList;
import java.util.List;

public class Veiculo {
    private String modelo;
    private String placa;
    private String fabricante;
    private double valorDiaria;
    private List<Locacao> locacoes = new ArrayList<>();

    public Veiculo(String modelo, String placa, String fabricante, double valorDiaria) {
        this.modelo = modelo;
        this.placa = placa;
        this.fabricante = fabricante;
        this.valorDiaria = valorDiaria;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getFabricante() {
        return fabricante;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public List<Locacao> getLocacoes() {
        return locacoes;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public void adicionarLocacao(Locacao locacao) {
        locacoes.add(locacao);
    }
}
