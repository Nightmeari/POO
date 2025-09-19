package Ac13;

public class Bilhete {
	private int numIngresso;
	private String descShow;
	private Comprador comprador;
	public Bilhete(int numIngresso, String descShow) {
		super();
		this.numIngresso = numIngresso;
		this.descShow = descShow;
	}
	
	
	public int getNumIngresso() {
		return numIngresso;
	}


	public void setNumIngresso(int numIngresso) {
		this.numIngresso = numIngresso;
	}


	public String getDescShow() {
		return descShow;
	}


	public void setDescShow(String descShow) {
		this.descShow = descShow;
	}


	public Comprador getComprador() {
		return comprador;
	}


	public void setComprador(Comprador comprador) {
		this.comprador = comprador;
	}


}
