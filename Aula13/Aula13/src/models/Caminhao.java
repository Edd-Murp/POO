package models;

public class Caminhao extends Veiculo {
    
    public Caminhao(String modelo, double valor) {
        super(modelo, valor);
    }

    @Override
    public void acelerar() {
        System.out.println("O caminhão está acelerando.");
    }

    @Override
    public double calcularImposto() {
        return super.getValor() * 0.15; // Exemplo de cálculo de imposto para caminhão
    }

}
