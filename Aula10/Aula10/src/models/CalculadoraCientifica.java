package models;

public class CalculadoraCientifica extends Calculadora {
    
    public double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }

    public double raizQuadrada(double numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Número negativo não tem raiz quadrada real.");
        }
        return Math.sqrt(numero);
    }

    //Sobreescrito
    @Override 
    public int somar(int valor1, int valor2) {
        return super.somar(valor1, valor2);
    }
    
}
