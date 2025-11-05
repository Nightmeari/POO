import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Veiculo> veiculos = new ArrayList<>();
    static List<Cliente> clientes = new ArrayList<>();
    static List<Locacao> locacoes = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static int locacaoId = 1;

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Cadastrar veículo");
            System.out.println("2. Cadastrar cliente");
            System.out.println("3. Registrar locação");
            System.out.println("4. Registrar devolução");
            System.out.println("5. Listar locações por CPF");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> cadastrarVeiculo();
                case 2 -> cadastrarCliente();
                case 3 -> registrarLocacao();
                case 4 -> registrarDevolucao();
                case 5 -> listarLocacoesPorCpf();
            }
        } while (opcao != 0);
    }

    static void cadastrarVeiculo() {
        System.out.print("Tipo (carro/moto): ");
        String tipo = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Placa: ");
        String placa = scanner.nextLine();
        System.out.print("Fabricante: ");
        String fabricante = scanner.nextLine();
        System.out.print("Valor diária: ");
        double valorDiaria = scanner.nextDouble();
        scanner.nextLine();

        if (tipo.equalsIgnoreCase("carro")) {
            System.out.print("Quantidade de portas: ");
            int portas = scanner.nextInt();
            scanner.nextLine();
            veiculos.add(new Carro(modelo, placa, fabricante, valorDiaria, portas));
        } else if (tipo.equalsIgnoreCase("moto")) {
            System.out.print("Cilindradas: ");
            int cilindradas = scanner.nextInt();
            scanner.nextLine();
            veiculos.add(new Moto(modelo, placa, fabricante, valorDiaria, cilindradas));
        } else {
            System.out.println("Tipo inválido.");
        }
    }

    static void cadastrarCliente() {
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        clientes.add(new Cliente(cpf, nome));
    }

    static void registrarLocacao() {
        System.out.print("CPF do cliente: ");
        String cpf = scanner.nextLine();
        Cliente cliente = buscarCliente(cpf);
        if (cliente == null) {
            System.out.println("Cliente não encontrado.");
            return;
        }

        System.out.print("Placa do veículo: ");
        String placa = scanner.nextLine();
        Veiculo veiculo = buscarVeiculo(placa);
        if (veiculo == null) {
            System.out.println("Veículo não encontrado.");
            return;
        }

        System.out.print("Data locação (AAAA-MM-DD): ");
        LocalDate dataLocacao = LocalDate.parse(scanner.nextLine());
        System.out.print("Data devolução (AAAA-MM-DD): ");
        LocalDate dataDevolucao = LocalDate.parse(scanner.nextLine());

        Locacao locacao = new Locacao(locacaoId++, dataLocacao, dataDevolucao, cliente, veiculo);
        locacoes.add(locacao);
        System.out.println("Locação registrada com sucesso.");
    }

    static void registrarDevolucao() {
        System.out.print("ID da locação: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        for (Locacao locacao : locacoes) {
            if (locacao.getId() == id) {
                System.out.print("Nova data de devolução (AAAA-MM-DD): ");
                LocalDate novaData = LocalDate.parse(scanner.nextLine());
                locacao.setDataDevolucao(novaData);
                System.out.println("Devolução atualizada.");
                return;
            }
        }
        System.out.println("Locação não encontrada.");
    }

    static void listarLocacoesPorCpf() {
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        for (Locacao locacao : locacoes) {
            if (locacao.getCliente().getCpf().equals(cpf)) {
                System.out.println("ID: " + locacao.getId() +
                        ", Veículo: " + locacao.getVeiculo().getModelo() +
                        ", De: " + locacao.getDataLocacao() +
                        ", Até: " + locacao.getDataDevolucao() +
                        ", Dias: " + locacao.getDias() +
                        ", Valor: R$" + locacao.getValorFinal());
            }
        }
    }

    static Cliente buscarCliente(String cpf) {
        for (Cliente c : clientes) {
            if (c.getCpf().equals(cpf)) return c;
        }
        return null;
    }

    static Veiculo buscarVeiculo(String placa) {
        for (Veiculo v : veiculos) {
            if (v.getPlaca().equals(placa)) return v;
        }
        return null;
    }
}
