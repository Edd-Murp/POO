package models;

public class Piano extends Instrumento {
    
    @Override 
    public void tocar() {
        System.out.println("O piano está sendo tocado.");
    }
    
}
