package models;

public class FreteExpresso extends Frete {

    public FreteExpresso(double peso, double distancia) {
        super(peso, distancia);
        
    }

    @Override
    public double calcularValor() {
        return super.calcularValor() + 15;
    }
    
}
