package pedido;

import java.util.ArrayList;
import itemPedido.ItemPedido;

public class Pedido {

    private ArrayList<ItemPedido> itens = new ArrayList<>();

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0;

        for (ItemPedido i : itens) {
            total += i.getSubtotal();
        }

        return total;
    }
}
