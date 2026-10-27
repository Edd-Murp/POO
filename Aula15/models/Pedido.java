package models;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<ItemPedido> itens = new ArrayList<>();

    public double calcularValorPedido(){
        double valor = 0;
        for (ItemPedido item : itens) {
            valor += item.getQtdItem() * item.getValor();
        }
        return valor;
    }

    public ArrayList<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemPedido> itens) {
        this.itens = itens;
    }

    public void adicionarItem(ItemPedido item) throws ItemPedidoException{
        if (item.getValor() <= 0) {
            throw new ItemPedidoException("Valor inválido.");
        }
        itens.add(item);
    }

}
