public class Main {
    public static void main(String[] args) {
        Carro carro1 = new CarroBasico("Fiat Uno", 30000.00, 52000);
        Carro carro2 = new CarroLuxo("BMW X5", 180000.00, 48000);
        Carro carro3 = new CarroLuxo("Audi A4", 200000.00, 51000);

        carro1.exibirInformacoes();
        carro2.exibirInformacoes();
        carro3.exibirInformacoes();
    }
}
