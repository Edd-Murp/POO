package models;

public class Casa extends Imovel {
    private int numeroDeQuartos;
    private boolean possuiGaragem;

    public Casa(String endereco, double valor, int numeroDeQuartos, boolean possuiGaragem) {
        super(endereco, valor);
        this.numeroDeQuartos = numeroDeQuartos;
        this.possuiGaragem = possuiGaragem;
    }

    public int getNumeroDeQuartos() {
        return numeroDeQuartos;
    }

    public boolean isPossuiGaragem() {
        return possuiGaragem;
    }
    
}
