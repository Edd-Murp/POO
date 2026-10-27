package models;

public class Calculadora {
    public double somar(double x, double y){
        return x+y;
    }
    public double subtrair(double x, double y){
        return x-y;
    }
    public double dividir(double x, double y){
        if (x == 0 | y == 0) {
            throw new ArithmeticException();
        }
        return x/y;
    }
    public double multiplicar(double x, double y){
        return x*y;
    }
    
}
