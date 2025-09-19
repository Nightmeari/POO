package Ac13;

public class Comprador {
 private String Nome ;
 private String cpf ;
public Comprador(String nome, String cpf) {
	super();
	Nome = nome;
	this.cpf = cpf;
}
public String getNome() {
	return Nome;
}
public void setNome(String nome) {
	Nome = nome;
}
public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}
 
 
}
