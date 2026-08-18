package models;

import java.util.ArrayList;

public class Imobiliaria {
    
    public Pessoa proprietario;
    public Endereco endereco;
    public ArrayList<Imovel> imoveis;
    
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
