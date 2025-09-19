package ac4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int aulas = 40;
		double nota1;
		double nota2;
		int presenca;
		String nome;
		String status = null;
		
		Scanner info = new Scanner(System.in);
		
		System.out.println("Insira seu nome:");
		nome = info.nextLine();
		
		System.out.println("Insira sua nota 1:");
		nota1 = info.nextDouble();
		
		System.out.println("Insira sua nota 2:");
		nota2 = info.nextDouble();
		
		info.nextLine();
		
		System.out.println("Insira sua frequência:");
		presenca = info.nextInt();
		
		info.close();
		
		double media = (nota1 + nota2)/2;
		double pres = (double)presenca/aulas;
		
		if (nota1 >= 7 && nota2 >= 7 && presenca >= (0.75*aulas)) {
			status = "Aprovado";
	}
		else if (nota1 < 7 || nota2 < 7 || presenca < (0.75*aulas) ) {
			status = "Reprovado";
	}
		System.out.println("Aluno: " + nome + ", cujas notas foram: " + nota1 + " ; " + nota2 + " e frequência: " + pres);
		System.out.println("Aluno: " + nome + "\nMédia: " + media + "\nStatus: " + status);


	}

}
