package models;

public abstract class ItemBiblioteca {
    private String titulo;
    private int ano;

    public ItemBiblioteca(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }
    public abstract int calcularPrazoEmprestimo();

    public String getTitulo() {
        return titulo;
    }
}

