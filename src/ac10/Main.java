package AC10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		
		System.out.println("Insira a quantidade de notas que deseja inserir: ");
		int x = info.nextInt();
		
	double total = 0;
	double media;
		
		double[] notas = new double[x];
		for(int i = 0 ; i < notas.length; i++) {
			System.out.println("Insira a nota " + (i+1) + ": ");
			notas[i] = info.nextDouble();
			total += notas[i];
		}
		 
		for(double i : notas) {
			System.out.println("Insira a nota " + i);
			
		}
		media = total / x;
		System.out.println("Média: " + media);
	}

}
