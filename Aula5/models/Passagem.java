package models;

public class Passagem {
    
    private String codigo;
    private double valor;
    private boolean passagemConfirmada;

    //Getter and Setter
    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public Double getValor(){
        return valor;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    public boolean isPassagemConfirmada(){
        return passagemConfirmada;
    }
    public void setPassagemConfirmada(boolean passagemConfirmada) {
        this.passagemConfirmada = passagemConfirmada;
    }
    

}
