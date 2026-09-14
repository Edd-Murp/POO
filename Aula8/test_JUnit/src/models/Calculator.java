package models;

public class Calculator {

    private double valor1;
    private double valor2;
    private String operacao;
       
    public Calculator(double valor1, double valor2, String operacao) {
        
    }

    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    //Metodos
    public double calcular(Calculator calculator) {
        switch (calculator.getOperacao()) {
            case "+":
                return calculator.getValor1() + calculator.getValor2();
            case "-":
                return calculator.getValor1() - calculator.getValor2() ;
            case "*":
                return calculator.getValor1() * calculator.getValor2();
            case "/":
                if (calculator.getValor2() == 0) {
                    throw new IllegalArgumentException("Divisão por zero não é permitida.");
                }
                return calculator.getValor1() / calculator.getValor2();
            default:
                throw new IllegalArgumentException("Operação inválida: " + calculator.getOperacao());
        }
    }

}