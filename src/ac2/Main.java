package ac2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a;
		int b;
		int c;


		Scanner valor = new Scanner(System.in);
		System.out.println("a: ");
		a = valor.nextInt();
		System.out.println("b: ");
		b = valor.nextInt();
		System.out.println("c: ");
		c = valor.nextInt();
		
		double delta = Math.pow(b, 2) - (4 * a * c);
		double x1 =((-b) + Math.sqrt(delta))/ 2*a;
		double x2 =((-b) - Math.sqrt(delta))/ 2*a;
		
		System.out.println("Delta = " + delta + "\nX1 = " + x1 + "\nX2 = " + x2);
		

	}

}
