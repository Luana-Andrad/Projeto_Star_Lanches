package cliente;

public class ClienteRodizio extends Cliente {
		private double valorFixo;
		
		public ClienteRodizio(String nome, int documento, double valorFixo) {
			super(nome, documento);
			this.valorFixo = valorFixo;
		}
		
		@Override
		public double calcularConta() {
			return valorFixo;
		}
}
