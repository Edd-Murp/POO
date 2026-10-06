package models;

public class Revista extends ItemBiblioteca {
    private int numeroEdicao;

    public Revista(String titulo, int ano) {
        super(titulo, ano);
    }

    @Override
    public int calcularPrazoEmprestimo() {
        return 30;
    }
    
}
