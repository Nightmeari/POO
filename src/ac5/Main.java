package ac5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double n1;
		double n2;
		int type;
		double res = 0;
		
		Scanner info = new Scanner(System.in);
		
		System.out.println("Número 1:");
		n1 = info.nextDouble();
		System.out.println("Número 2:");
		n2 = info.nextDouble();
		
		System.out.println("Soma = 1; Subtração = 2; Multiplicação = 3; Divisão = 4");
		type = info.nextInt();

		info.close();
		
		switch(type) {
			case 1: 
				res = n1 + n2;
				break;
			case 2:
				res = n1 - n2;
				break;
			case 3:
				res = n1*n2;
				break;
			case 4:
				if (n2 != 0) {
				res = n1/n2;
				}
				else { res = 404; }
				break;
				
			default:
				res = 404;
			}
		
		System.out.println(res);

	}

}
