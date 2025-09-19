import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o raio do cilindro: ");
        double raio = input.nextDouble();

        System.out.print("Digite a altura do cilindro: ");
        double altura = input.nextDouble();

        double area = 2 * Math.PI * raio * (raio + altura);
        double volume = Math.PI * Math.pow(raio, 2) * altura;

        System.out.printf("Área = %.2f%n", area);
        System.out.printf("Volume = %.2f%n", volume);

        input.close();
    }
}
