package models;

public class Carro implements Abastecivel {
    private double capacidadeTanque;
    private double combustivelAtual;

    public Carro(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
        this.combustivelAtual = 0.0;
    }

    @Override
    public void abastecer(double litros) {
        if (litros > 0) {
            combustivelAtual += litros;
            if (combustivelAtual > capacidadeTanque) {
                combustivelAtual = capacidadeTanque;
                System.out.println("Tanque cheio!");
            }
            System.out.println("Carro abastecido com " + litros + " litros. Nível atual: " + combustivelAtual + " litros.");
        } else {
            System.out.println("Quantidade de litros inválida para abastecimento.");
        }
    }

    public double getNivelCombustivel() {
        return combustivelAtual;
    }
    
}
