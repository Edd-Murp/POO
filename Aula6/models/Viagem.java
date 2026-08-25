package models;

import java.util.ArrayList;

public class Viagem {
    
    private Pessoa passageiro;
    private ArrayList<Destino> destinos;
    private ArrayList<Passagem> passagens;
    private double distancia;
    private String origem;

    public Viagem(ArrayList<Destino> destinos) {
        this.destinos = destinos;
    }
    public Viagem(ArrayList<Destino> destinos, String origem) {    
        this.destinos = destinos;
        this.origem = origem;
    }
    public Viagem(ArrayList<Destino> destinos, String origem, double distancia) {    
        this.destinos = destinos;
        this.origem = origem;
        this.distancia = distancia;
    }



    //Getters & Setters 
    public Pessoa getPassageiro() {
        return passageiro;
    }
    public void setPassageiro(Pessoa passageiro) {
        this.passageiro = passageiro;
    }
    public ArrayList<Destino> getDestinos() {
        return destinos;
    }
    public void setDestinos(ArrayList<Destino> destinos) {
        this.destinos = destinos;
    }
    public ArrayList<Passagem> getPassagens() {
        return passagens;
    }
    public void setPassagens(ArrayList<Passagem> passagens) {
        this.passagens = passagens;
    }
    public double getDistancia() {
        return distancia;
    }
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    public void setOrigem(String origem) {
        this.origem = origem;
    }
    public String getOrigem() {
        return origem;
    }

    public void calcularCusto(double precoCombustivel){
        double custoTotal = distancia * precoCombustivel;
        System.out.println("Custo total da viagem: R$" + custoTotal);
    }
    public void calcularCusto(double precoCombustivel, double valorPedagio){
        double custoTotal = distancia * precoCombustivel + valorPedagio;
        System.out.println("Custo total da viagem: R$" + custoTotal);
    }   
}
