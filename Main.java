package main;

import mesa.Mesa;
import prato.Prato;
import pedido.Pedido;
import itemPedido.ItemPedido;
import comanda.Comanda;
import cliente.ClienteComum;

public class Main {

    public static void main(String[] args) {

        Mesa mesa1 = new Mesa(1);

        Prato pizza = new Prato("Pizza", 50, "Jantar");
        Prato refri = new Prato("Refrigerante", 8, "Bebida");

        Pedido pedido = new Pedido();
        pedido.adicionarItem(new ItemPedido(pizza, 2));
        pedido.adicionarItem(new ItemPedido(refri, 3));

        Comanda comanda = new Comanda(mesa1);
        comanda.adicionarPedido(pedido);

        ClienteComum cliente = new ClienteComum("Amanda", 12345);
        cliente.setTotal(comanda.calcularTotal());

        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Total: R$ " + cliente.calcularConta());
    }
}
