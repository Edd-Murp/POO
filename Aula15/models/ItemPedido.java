package models;

public class ItemPedido {
    private double valor;
    private int qtdItem;
    private Produto produto;
    
    public ItemPedido(double valor, int qtdItem, Produto produto) throws ItemPedidoException {
        setQtdItem(qtdItem);
        setValor(valor);
        this.produto = produto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) throws ItemPedidoException{
        if (valor <= 0) {
            throw new ItemPedidoException("Valor inválido");
        }
        this.valor = valor;
    }

    public int getQtdItem() {
        return qtdItem;
    }

    public void setQtdItem(int qtdItem) throws ItemPedidoException{
         if (valor <= 0) {
            throw new ItemPedidoException("Valor inválido");
        }
        this.qtdItem = qtdItem;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    
    
}
