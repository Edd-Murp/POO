package models;

public class Bateria extends Instrumento {
    
    @Override 
    public void tocar() {
        System.out.println("A bateria está sendo tocada.");
    }
    
}
