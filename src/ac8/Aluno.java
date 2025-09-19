package ac8;

public class Aluno {
	private int matricula;
	private String nome;
	private double nota1;
	private double nota2;
	private double notaac;
	private double notaas;
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNotaac() {
		return notaac;
	}
	public void setNotaac(double notaac) {
		this.notaac = notaac;
	}
	public double getNotaas() {
		return notaas;
	}
	public void setNotaas(double notaas) {
		this.notaas = notaas;
	}
	public Aluno(int matricula, String nome, double nota1, double nota2, double notaac) {
		this.matricula = matricula;
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.notaac = notaac;
	}
	
	public double media(double x, double y, double z) {
		return (nota1 *4 + nota2 *4 + notaac *2)/10;
	}
	
	
}
