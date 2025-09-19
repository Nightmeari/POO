package Ac13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
				Scanner info = new Scanner(System.in);
				
				String nome;
				String cpf;
				int NumIngresso;
				String descShow;
				
				System.out.println("Insira o nome: ");
				nome = info.nextLine();
				
				System.out.println("Insira o cpf: ");
				cpf = info.nextLine();
				
				System.out.println("Insira o numero do show: ");
				NumIngresso = info.nextInt();
				info.nextLine();
				
				System.out.println("Insira a descrição do show: ");
				descShow = info.nextLine();
				
				Comprador comprador1 = new Comprador(nome, cpf);
				Bilhete bilhete1 = new Bilhete(NumIngresso, descShow);
				
				
				bilhete1.setComprador(comprador1);
				info.close();
				
				System.out.println("\n=== RESUMO DA TRANSAÇÃO ===");
				System.out.println("Número do ingresso: " + bilhete1.getNumIngresso());
				System.out.println("Descrição do show: " + bilhete1.getDescShow());
				System.out.println("Comprador: " + comprador1.getNome() + " - CPF: " + comprador1.getCpf());


			}

		

	}


