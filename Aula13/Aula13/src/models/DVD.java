package models;

public class DVD extends ItemBiblioteca {
    private String diretor;

    public DVD(String titulo, int ano) {
        super(titulo, ano);
    }

    @Override
    public int calcularPrazoEmprestimo() {
        return 7;
    }
    
}
