package models;

public class ConversorDeNumero {
    public double paraDouble(String texto){
        return Double.parseDouble(texto);
    }

    public int paraInt(String texto){
        return Integer.parseInt(texto);
    }
}
