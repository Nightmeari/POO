package ac7;

public class Cilindro {
	double raio;
	double altura;
	double pi = Math.PI;
	
	double area(double raio, double altura) {
	    return 2 * pi * raio * (raio + altura);  
	}
	double volume(double raio, double altura) {
	    return  pi * Math.pow(raio, 2) * altura;  
	}
}
