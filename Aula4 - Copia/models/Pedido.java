package models;
public class Pedido {
    
    public Pessoa cliente;
    public ItemPedido itemPedido;
    
    public Pessoa getCliente() {
        return cliente;
    }
    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }
    public ItemPedido getItemPedido() {
        return itemPedido;
    }
    public void setItemPedido(ItemPedido itemPedido) {
        this.itemPedido = itemPedido;
    }

    

}
