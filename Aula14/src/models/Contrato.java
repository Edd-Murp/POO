package models;

public class Contrato implements Imprimivel{

    private String numero;

    public Contrato(String numero) {
        this.numero = numero;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo contrato: " + numero);
    }
    
}
