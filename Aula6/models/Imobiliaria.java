package models;

import java.util.ArrayList;

public class Imobiliaria {
    
    private Pessoa proprietario;
    private Endereco endereco;
    private ArrayList<Imovel> imoveis;
    
    //Getter and Setter
    public Pessoa getProprietario() {
        return proprietario;
    }
    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public ArrayList<Imovel> getImoveis() {
        return imoveis;
    }
    public void setImoveis(ArrayList<Imovel> imoveis) {
        this.imoveis = imoveis;
    }
    
    
}
