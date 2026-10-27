package models;

public class ContaBancaria {
    private int numConta;
    private String titular;
    private double saldo;
    
    public ContaBancaria(int numConta, String titular, double saldo) {
        this.numConta = numConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if (valor <  0) {
            throw new IllegalArgumentException("Valor invalido");
        }
        saldo += valor;
    }
    
    public void sacar(double valor){
        if (valor <  0 | valor > saldo) {
            throw new IllegalArgumentException("Valor invalido");
        }
        saldo -= valor;
    } 

    public void consultarSaldo(){
        System.out.println("Saldo: "+ saldo);
    }
    
    
}
