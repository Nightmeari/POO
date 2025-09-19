package ac7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int sair = 0;
		while(sair !=1) {
			
		
		Scanner info = new Scanner(System.in);
		
		System.out.println("Digite a matrícula do aluno: ");
		int matricula = info.nextInt();
		info.nextLine();
		
		System.out.print("Digite o nome do aluno: ");
        String nome = info.nextLine();

        System.out.print("Digite a nota A1: ");
        double nota1 = info.nextDouble();

        System.out.print("Digite a nota A2: ");
        double nota2 = info.nextDouble();

        System.out.print("Digite a nota da Atividade Complementar (AC): ");
        double notaac = info.nextDouble();
        
        Aluno aluno = new Aluno(matricula, nome, nota1, nota2, notaac);
        
        double media = aluno.media(nota1, nota2, notaac);
        
        if (media >= 7) {
        	System.out.println("Você foi aprovado!");
        	System.out.println("Sua média foi: " + media);
        } else {
        	System.out.println("Você fará AS.");
        	System.out.println("Digite a nota da AS: ");
        	double notaas = info.nextDouble();
        	if(nota1 < nota2) {
        		media = aluno.media(notaas, nota2, notaac);
        		System.out.println("Sua média foi: " + media);
        		if (media >= 7) { System.out.println("Você foi aprovado!");
        	}else { System.out.println("Você foi reprovado.");
        }

	}else {
		media = aluno.media(notaas, nota2, notaac);
		System.out.println("Sua média foi: " + media);
		if (media >= 7) { System.out.println("Você foi aprovado!");
	}else { System.out.println("Você foi reprovado.");
}
	}

} System.out.println("Digite 1 para sair ou 0 para continuar: ");
sair = info.nextInt();
}
}
}
