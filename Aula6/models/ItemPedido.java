package models;
public class ItemPedido {
    
    private Produto produto;
    private int quantidade;
    
    //Getter and Setter
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
