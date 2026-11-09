package Parte1.models;

import java.io.Serializable;

public class ContaBancaria implements Serializable{

    private final static long serialVersionUID = 1L;
    
    private int numeroConta;
    private String agencia;
    private String titular;
    private double saldo;
    
    public ContaBancaria(int numeroConta, String agencia, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
}