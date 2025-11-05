import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Cadastrar produtos");
            System.out.println("2. Acessar produto por índice");
            System.out.println("3. Calcular preço médio");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");

            try {
                opcao = sc.nextInt();
                sc.nextLine(); // limpar buffer

                switch (opcao) {
                    case 1 -> {
                        while (true) {
                            try {
                                System.out.print("Nome do produto: ");
                                String nome = sc.nextLine();
                                System.out.print("Preço: ");
                                double preco = sc.nextDouble();
                                System.out.print("Quantidade em estoque: ");
                                int qtd = sc.nextInt();
                                sc.nextLine(); // limpar buffer
                                produtos.add(new Produto(nome, preco, qtd));
                                System.out.print("Cadastrar outro? (s/n): ");
                                String continuar = sc.nextLine();
                                if (continuar.equalsIgnoreCase("n")) break;
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada inválida. Tente novamente.");
                                sc.nextLine(); // limpar buffer
                            }
                        }
                    }
                    case 2 -> {
                        try {
                            System.out.print("Índice do produto: ");
                            int indice = sc.nextInt();
                            sc.nextLine();
                            Produto p = produtos.get(indice);
                            System.out.println("Produto encontrado: " + p);
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Índice fora do intervalo.");
                        } catch (InputMismatchException e) {
                            System.out.println("Entrada inválida.");
                            sc.nextLine();
                        }
                    }
                    case 3 -> {
                        try {
                            if (produtos.isEmpty()) throw new ArithmeticException("Lista vazia");
                            double soma = 0;
                            for (Produto p : produtos) soma += p.getPreco();
                            double media = soma / produtos.size();
                            System.out.println("Preço médio: R$" + media);
                        } catch (ArithmeticException e) {
                            System.out.println("Não há produtos cadastrados.");
                        } catch (Exception e) {
                            System.out.println("Erro ao calcular média.");
                        }
                    }
                    case 0 -> System.out.println("Encerrando...");
                    default -> System.out.println("Opção inválida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número.");
                sc.nextLine(); // limpar buffer
                opcao = -1;
            }
        } while (opcao != 0);
    }
}
