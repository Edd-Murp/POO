package models;

import java.util.ArrayList;

public class Loja {
    private ArrayList<Pedido> pedidos;

    public Loja() {
        this.pedidos = new ArrayList<>();
    }

    public double calcularTotalFretes() {
        double total = 0;
        for (Pedido pedido : pedidos) {
            pedido.calcularFrete();
            total += pedido.getValor();
        }
        return total;
    }
}
