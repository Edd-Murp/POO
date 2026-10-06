package models;

public class Carro extends Veiculo {
    
    public Carro(String modelo, double valor) {
        super(modelo, valor);
    }

    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }

    @Override
    public double calcularImposto() {
        return super.getValor() * 0.1;
    }
    
}
