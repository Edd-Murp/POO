package models;

import java.util.ArrayList;

public class Viagem {
    
    private Pessoa passageiro;
    private ArrayList<Destino> destinos;
    private ArrayList<Passagem> passagens;
    
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

    
}
