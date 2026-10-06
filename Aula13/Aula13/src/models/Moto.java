package models;

public class Moto extends Veiculo {
    
    public Moto(String modelo, double valor) {
        super(modelo, valor);
    }

    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando.");
    }
    
    @Override
    public double calcularImposto() {
        return super.getValor() * 0.05;
    }
}
