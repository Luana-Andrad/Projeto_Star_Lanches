package itemPedido;

import prato.Prato;

public class ItemPedido {

    private Prato prato;
    private int quantidade;

    public ItemPedido(Prato prato, int quantidade) {
        this.prato = prato;
        this.quantidade = quantidade;
    }

    public double getSubtotal() {
        return prato.getPreco() * quantidade;
    }
}
