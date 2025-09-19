package ac7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		System.out.println("Raio: ");
		double raio = info.nextDouble();
		System.out.println("Altura: ");
		double altura = info.nextDouble();
		
		Cilindro cil = new Cilindro();
		cil.raio = raio;
        cil.altura = altura;
        
        System.out.printf("Área da base: %.2f%n", cil.area(raio, altura));
        System.out.printf("Volume: %.2f%n", cil.volume(raio, altura));

	}

}
