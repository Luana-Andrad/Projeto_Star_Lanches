package prato;

public class Prato {
	
	private String nome;
	private double preco;
	private String categoria;
	
	public Prato(String nome, double preco, String categoria) {
		this.nome = nome;
		this.preco = preco;
		this.categoria = categoria;
	}
	public String getNome() {
		return nome;
	}
	public double getPreco() {
		return preco;
	}
	 public String getCategoria() {
	    return categoria;
	}
}
