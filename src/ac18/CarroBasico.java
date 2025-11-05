public class CarroBasico extends Carro {
    public CarroBasico(String descricao, double valor, int kmAtual) {
        super(descricao, valor, kmAtual);
    }

    @Override
    public double calcularDiaria() {
        return getValor() / 2000;
    }

    @Override
    public void verificarKm() {
        if (getKmAtual() > LIMITE_KM) {
            System.out.println("⚠️ Enviar carro básico para revisão.");
        } else {
            System.out.println("✅ Quilometragem dentro do limite.");
        }
    }
}
