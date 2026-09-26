package Cardapio;

import java.util.ArrayList;
import prato.Prato;

public class Cardapio {
	private ArrayList<Prato> pratos = new ArrayList<Prato>();

    public void adicionarPrato(Prato prato) {
        pratos.add(prato);
    }

    public void listarPratos() {
        for (Prato p : pratos) {
            System.out.println(p.getNome() + " - R$" + p.getPreco());
        }
    }
}
