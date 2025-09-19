package ac9;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int operacao = -1;
		
		while (operacao != 5) {
			Scanner info = new Scanner(System.in);
			
			System.out.println("Digite seu nome: ");
			String nome = info.nextLine();
			
			System.out.println("Digite seu cpf: ");
			int cpf = info.nextInt();
			
			System.out.println("Digite seu número de conta: ");
			int cod = info.nextInt();
			
			System.out.println("Digite seu saldo: ");
			double saldo = info.nextDouble();
				
			Cliente cliente1 = new Cliente(nome, cpf, cod, saldo);
			
			if (saldo >= 0) {
				System.out.println("Escolha qual operação você deseja fazer:\n 1 - Depósito\n 2 - Sacar\n 3 - Transferir\n 4 - Exibir dados\n 5 - Sair");
				operacao = info.nextInt();
				
				if (operacao == 1) {
					System.out.println("Insira o valor do depósito: ");
					double valor = info.nextDouble();
					saldo = cliente1.depositar(valor);
					System.out.println("Depósito realizado!\n O saldo atual da sua conta é: " + saldo);
				}
				else if (operacao == 2){
					saldo = cliente1.sacar();
				} else if (operacao == 3) {
					info.nextLine();
					
					System.out.println("Digite seu nome: ");
					nome = info.nextLine();
					
					System.out.println("Digite seu cpf: ");
					cpf = info.nextInt();
					
					System.out.println("Digite seu número de conta: ");
					cod = info.nextInt();
					
					System.out.println("Digite seu saldo: ");
					saldo = info.nextDouble();
						
					Cliente cliente2 = new Cliente(nome, cpf, cod, saldo);
					
					System.out.println("Insira o valor da transferência: ");
					double valor = info.nextDouble();
					
					saldo = cliente1.sacar();
					saldo = cliente2.depositar(valor);
					System.out.println("Transferencia realizada!");
					System.out.println("Cliente: " + cliente1.getNome() + "\nSaldo atual: " + cliente1.getSaldo());
					System.out.println("Cliente: " + cliente2.getNome() + "\nSaldo atual: " + cliente2.getSaldo());
				} else if (operacao == 4) {
					System.out.println(cliente1.exibir());
				}else if (operacao == 5 ) {
					System.out.println("Programa finalizado.");
					break;
				} else {
					System.out.println("Operação invalida");
				}
			} else {
				System.out.println("Seu saldo não pode ser negativo!");
			}
		}
	}
}
