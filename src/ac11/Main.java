package AC11;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {        
    Scanner info = new Scanner(System.in);
        System.out.print("Informe a quantidade de alunos: ");        
        int qtdAlunos = info.nextInt();
        System.out.print("Informe a quantidade de notas por aluno: ");        
        int qtdNotas = info.nextInt();
  
        for (int i = 0; i < qtdAlunos; i++) {            
        double soma = 0;            
        System.out.println("\nAluno " + (i + 1) + ":");
            for (int j = 0; j < qtdNotas; j++) {                
            System.out.print("Digite a nota " + (j + 1) + ": ");                
            notas[i][j] = info.nextDouble();                soma += notas[i][j];            
            }
            double media = soma / qtdNotas;            
            System.out.println("Média do aluno " + (i + 1) + ": " + media);        
            }
        info.close();    
        }
      }
