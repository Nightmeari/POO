package ac9;

import java.util.Scanner;

public class Cliente {

	private String nome;
	private int cpf;
	private int cod; //numero da conta
	private double saldo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Cliente(String nome, int cpf, int cod, double saldo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.cod = cod;
		this.saldo = saldo;
	}
	
	public double depositar(double x) {
		this.saldo = saldo + x;
		return saldo;
	}
	
	public double sacar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o valor : ");
		double valor = sc.nextDouble();
		if(valor <= saldo) {
			this.saldo = saldo - valor;
			System.out.println("Saque realizado!\n O saldo atual da sua conta é: " + saldo);
		} else {
			System.out.println("Impossível realizar o saque. Saldo insuficiente.");
			}
		return saldo;
	}
	
	public String exibir() {
		return("Nome: " + nome + "\nCPF: " + cpf + "\nCódigo: " + cod + "\nSaldo: " + saldo);
	}
	
}
