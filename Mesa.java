package mesa;

public class Mesa {
	private int numeroMesa;
	private String status;
	
	public Mesa (int numeroMesa){
		this.numeroMesa = numeroMesa;
		this.status = "Livre";
		}
	public int getnumeroMesa() {
		return numeroMesa;
		}
	public String getStatus() {
		return status;
	}
	public void ocupar() {
		status = "Ocupado";
	}
	public void liberar() {
		status = "Livre";
	}
}
