package ac6;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		
		int i = 0;
		String senha = null;
		double saldo = 1000.00;
		double limite = 500.00;
		double destino = 2000;
		int chave = null;
		double valor = null;
		
		System.out.println("INSIRA SUA SENHA: ");
		senha = info.nextLine();
		
		while (senha != "J@vaPOO" && i < 3) {
			int tentativas = 3 - i;
			System.out.println("Tentativas restantes: " + tentativas);
			System.out.println("Insira sua senha: ");
			senha = info.nextLine();
			i++;
		}
		if (senha == "J@vaPOO") {
			System.out.println("Usuário autenticado!");
			System.out.println("Insira a chave pix: ");
			info.nextLine();
			chave = info.nextInt();
			System.out.println("Informe o valor da transferecia: ");
			valor = info.nextDouble();
			if (valor <= limite) {
				System.out.println("Tranferência bem sucedida!");
				double total = destino + valor;
				double sfinal = saldo - valor;
				System.out.println("Relatório: \n" + "Valor da transferência: \n" + valor + "Resultado: Realizada.\n" + "Saldo final destino: " + total + "Limite de transação: " + limite + "Saldo final: " + sfinal) ;
			}
			else {
				System.out.println("Tranferência não realizada!");
				System.out.println("Relatório: \n" + "Valor da transferência: \n" + valor + "Resultado: Não Realizada.\n" + "Saldo final destino: " + destino + "Limite de transação: " + limite + "Saldo final: " + saldo) ;
			}
		}
	}
}
