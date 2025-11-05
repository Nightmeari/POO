public class CarroLuxo extends Carro {
    public CarroLuxo(String descricao, double valor, int kmAtual) {
        super(descricao, valor, kmAtual);
    }

    @Override
    public double calcularDiaria() {
        double diaria = getValor() / 1000;
        return diaria > 190.00 ? 190.00 : diaria;
    }

    @Override
    public void verificarKm() {
        if (getKmAtual() > LIMITE_KM) {
            System.out.println("⚠️ Enviar carro luxo para concessionária do grupo.");
        } else {
            System.out.println("✅ Quilometragem dentro do limite.");
        }
    }
}
