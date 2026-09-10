import models.Calculator;

public class App {
    public static void main(String[] args) throws Exception {
        
        Calculator calculadora = new Calculator(10, 5, "+");
        System.out.println("Resultado da soma: " + calculadora.calcular(calculadora));

        calculadora.setOperacao("-");
        System.out.println("Resultado da subtração: " + calculadora.calcular(calculadora));

        calculadora.setOperacao("*");
        System.out.println("Resultado da multiplicação: " + calculadora.calcular(calculadora));
        
        calculadora.setOperacao("/");
        System.out.println("Resultado da divisão: " + calculadora.calcular(calculadora));
    }
}
