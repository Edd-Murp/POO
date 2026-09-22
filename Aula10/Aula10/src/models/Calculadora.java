package models;

public class Calculadora {
    
    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }
    
    public double somar(double valor1, double valor2) {
        return valor1 + valor2;
    }

    //Método sobrecarregado para somar dois inteiros
    public int somar(int valor1, int valor2) {
        return valor1 + valor2;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }
}
