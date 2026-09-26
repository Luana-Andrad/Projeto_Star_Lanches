package cliente;

public class ClienteComum extends Cliente {
	private double total;
	
	public ClienteComum(String nome, int documento) {
		super(nome, documento);
	}
	public void setTotal(double total) {
		this.total = total;
	}
	@Override
	public double calcularConta() {
		return total;
	}
}
