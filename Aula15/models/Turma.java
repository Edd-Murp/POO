package models;

public class Turma {
    private double[] notas = new double[3];

    public Turma(){
        
    }

    public double media(double[] notas){
        double media = 0;
        for (double d : notas) {
            media += d;
        }
        return media /= notas.length;
    }
    
    public void setNotasPelaPosicao( int pos, double valor) {
        this.notas[pos] = valor;
    }

    

}
