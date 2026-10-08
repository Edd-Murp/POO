package models;

public abstract class Pedido {
        private int numero;
        private double valor;

    public Pedido(int numero, double valor) {
        this.numero = numero;   
        this.valor = valor;
    }

    public abstract void calcularFrete();

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    
}
