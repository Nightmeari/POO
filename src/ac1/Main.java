package ac1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String nome1;
		String nome2;
		String nome3;
		double sal1;
		double sal2;
		double sal3;
		
		Scanner info = new Scanner(System.in);
		
		System.out.print("Digite o nome do 1 funcionário: ");
		nome1 = info.nextLine();
		System.out.print("Digite o salario do 1 funcionário: ");
		sal1 = info.nextDouble();
		
		info.nextLine();
		
		System.out.print("Digite o nome do 2 funcionário: ");
		nome2 = info.nextLine();
		System.out.print("Digite o salario do 2 funcionário: ");
		sal2 = info.nextDouble();
		
		info.nextLine();
		
		System.out.print("Digite o nome do 3 funcionário: ");
		nome3 = info.nextLine();
		System.out.print("Digite o salario do 3 funcionário: ");
		sal3 = info.nextDouble();
		
		info.close();
		
		System.out.println("Nome: " + nome1 + " Salário: " + sal1);
		System.out.println("Nome: " + nome2 + " Salário: " + sal2);
		System.out.println("Nome: " + nome3 + " Salário: " + sal3);
		
		double media = (sal1 + sal2 + sal3)/3;
		
		System.out.printf("Média: " + media);
		

	}

}
