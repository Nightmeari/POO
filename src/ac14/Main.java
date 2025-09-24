package Ac14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);

        Funcionario[] funcionarios = new Funcionario[2];

        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println("=== Cadastro do Funcionário " + (i + 1) + " ===");

            System.out.print("Nome: ");
            String nome = info.nextLine();

            System.out.print("Cargo: ");
            String cargo = info.nextLine();

            System.out.print("Salário: ");
            double salario = info.nextDouble();
            info.nextLine(); 

            System.out.print("Número da Carteira: ");
            String numero = info.nextLine();

            System.out.print("Data de Emissão: ");
            String dataEmissao = info.nextLine();

            System.out.print("Órgão Emissor: ");
            String orgaoEmissor = info.nextLine();

            Funcionario f = new Funcionario(nome, cargo, salario);
            CarteiraTrabalho ct = new CarteiraTrabalho(numero, dataEmissao, orgaoEmissor);
            f.setCarteira(ct);

            funcionarios[i] = f;
            System.out.println();
        }

        info.close();

        System.out.println("=== DADOS CADASTRADOS ===");
        for (Funcionario f : funcionarios) {
            System.out.println("Funcionario: " + f.getNome());
            System.out.println("Cargo: " + f.getCargo());
            System.out.println("Salário: " + f.getSalario());
            System.out.println("Carteira - Número: " + f.getCarteira().getNumero());
            System.out.println("Carteira - Data de Emissão: " + f.getCarteira().getDataEmissao());
            System.out.println("Carteira - Órgão Emissor: " + f.getCarteira().getOrgaoEmissor());
            System.out.println("-------------------------");
        }
    }
}
