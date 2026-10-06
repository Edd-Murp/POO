package models;

public class Livro extends ItemBiblioteca {
    private String autor;

    public Livro(String titulo, int ano) {
        super(titulo, ano);
    }

    @Override
    public int calcularPrazoEmprestimo() {
        return 14;
    }
    
}
