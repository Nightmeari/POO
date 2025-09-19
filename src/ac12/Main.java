package AC12;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);

        ArrayList<Produto> cesta = new ArrayList<>();

        System.out.print("Deseja adicionar um produto? (1 - sim / 2 - não): ");
        int opcao = info.nextInt();
        info.nextLine(); 

        while (opcao == 1) {
            System.out.print("Digite o nome do produto: ");
            String nome = info.nextLine();

            System.out.print("Digite o valor do produto: ");
            double valor = info.nextDouble();
            info.nextLine(); 

            Produto p = new Produto(nome, valor);
            cesta.add(p);

            System.out.print("Deseja adicionar outro produto? (1 - sim / 2 - não): ");
            opcao = info.nextInt();
            info.nextLine(); 
        }

        double total = 0;
        for (Produto p : cesta) {
            total += p.valor;
        }

        System.out.print("\nDigite o número de parcelas: ");
        int parcelas = info.nextInt();
        double valorParcela = total / parcelas;

        System.out.println("\n===== RESUMO DA COMPRA =====");
        for (int i = 0; i < cesta.size(); i++) {
            Produto p = cesta.get(i);
            System.out.println((i + 1) + ". " + p.nome + " - R$ " + p.valor);
        }
        System.out.println("---------------------------");
        System.out.println("Total da compra: R$ " + total);
        System.out.println("Número de parcelas: " + parcelas);
        System.out.println("Valor de cada parcela: R$ " + valorParcela);

        info.close();
    }
}
