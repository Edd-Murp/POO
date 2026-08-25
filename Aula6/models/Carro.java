package models;

public class Carro {

    private Pessoa dono;
    private Motor motor;
    private String modelo;
    private String cor;
    private int ano;
    private double quilometragem;
    private boolean ligado;
    private String marca;
    private int velocidade;
    private static int velocidadeMaximaPermitida = 110;


    public Carro(String modelo, int ano, String marca) {
        this.modelo = modelo;
        this.ano = ano;
        this.marca = marca;
    }
    
    public Carro(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    public Carro(Motor motor, String modelo, int ano, String marca) {
        this.motor = motor;
        this.modelo = modelo;
        this.ano = ano;
        this.marca = marca;
    }

    
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

    public String getMarca() {
        return marca;
    }
    
    public static int getVelocidadeMaximaPermitida() {
        return velocidadeMaximaPermitida;
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

    public static void setVelocidadeMaximaPermitida(int velocidadeMaximaPermitida) {
        Carro.velocidadeMaximaPermitida = velocidadeMaximaPermitida;
    }


    //Methods
    public void ligar(){
        ligado = true;
    }

    public void desligar(){
        ligado = false;
    }

    public void aumentarKM(){
        quilometragem += 10;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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

    public void acelerar(){
        velocidade += 10;
    }
    
    public void acelerar(int valor){
        velocidade += valor;
    }

    public static boolean verificarVelocidade(int velocidadeAtual) {
        if(velocidadeAtual > velocidadeMaximaPermitida){
            return false;
        }else{
            return true;
        }
    }

}

