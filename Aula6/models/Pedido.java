package models;
public class Pedido {
    
    private Pessoa cliente;
    private ItemPedido itemPedido;

    //Getter and Setter
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
