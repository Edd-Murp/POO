package models;

public class Reserva {
    private String nomeHospede;
    private int quantidadeDiarias;
    private double valorDiaria;
    
    public Reserva(String nomeHospede, int quantidadeDiarias, double valorDiaria) {
        this.nomeHospede = nomeHospede;
        this.quantidadeDiarias = quantidadeDiarias;
        this.valorDiaria = valorDiaria;
    }
    
    public String getNomeHospede() {
        return nomeHospede;
    }
    
    public void setNomeHospede(String nomeHospede) {
        this.nomeHospede = nomeHospede;
    }
    
    public int getQuantidadeDiarias() {
        return quantidadeDiarias;
    }
    
    public void setQuantidadeDiarias(int quantidadeDiarias) {
        this.quantidadeDiarias = quantidadeDiarias;
    }
    
    public double getValorDiaria() {
        return valorDiaria;
    }
    
    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
    
    public double calcularTotal() {
        return quantidadeDiarias * valorDiaria;
    }
}
