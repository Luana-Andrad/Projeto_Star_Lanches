package cliente;

public abstract class Cliente {
	private String nome;
	private int documento;
	
	public Cliente(String nome, int documento) {
		this.nome = nome;
		this.documento = documento;
	}
	public String getNome() {
		return nome;
	}
	public int getDocumento() {
		return documento;
	}
	public abstract double calcularConta ();
	
}
