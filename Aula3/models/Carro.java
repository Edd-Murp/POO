package models;

public class Carro {

    public Pessoa dono;
    public Motor motor;
    public String modelo;
    public String cor;
    public int ano;
    public double quilometragem;
    public boolean ligado;

    
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
        return motor.potencia;
    }

    public String descricao() {
        return "Carro [dono=" + dono.nome + ", potencia=" + motor.potencia + ", modelo=" + modelo + "]";
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
