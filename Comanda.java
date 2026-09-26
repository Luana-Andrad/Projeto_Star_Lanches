package comanda;

import java.util.ArrayList;
import mesa.Mesa;
import pedido.Pedido;

public class Comanda {

    private Mesa mesa;
    private ArrayList<Pedido> pedidos = new ArrayList<>();
    private String status = "Aberta";

    public Comanda(Mesa mesa) {
        this.mesa = mesa;
        mesa.ocupar();
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public double calcularTotal() {
        double total = 0;

        for (Pedido p : pedidos) {
            total += p.calcularTotal();
        }

        return total;
    }

    public void fechar() {
        status = "Fechada";
        mesa.liberar();
    }
}
