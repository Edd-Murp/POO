package models;

public class Carro {

    private Pessoa dono;
    private Motor motor;
    private String modelo;
    private String cor;
    private int ano;
    private double quilometragem;
    private boolean ligado;

    //Getter
    public Pessoa getDono() {
        return dono;
    }

    public Motor getMotor() {
        return motor;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public boolean isLigado() {
        return ligado;
    }

    
    //Setter
    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void ligar(){
        ligado = true;
    }

    public void desligar(){
        ligado = false;
    }

    public void aumentarKM(){
        quilometragem += 10;
    }

    public String ligado(){
        if (this.ligado = true) {
            return "Carro ligado";
        }else{
            return "Carro desligado";
        }
    }

    public int obterPotencia(){
        return motor.getPotencia();
    }

    public String descricao() {
        return "Carro [dono=" + dono.getNome() + ", potencia=" + motor.getPotencia() + ", modelo=" + modelo + "]";
    }

    public void viajar(){
        if (ligado == true) {
            for (int i = 0; i < 4; i++) {
                aumentarKM();
            }
        }else{
            System.out.println("Carro desligado.");
        }
    }
}
