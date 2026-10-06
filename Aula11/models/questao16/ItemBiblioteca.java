package models.questao16;

public abstract class ItemBiblioteca {
    protected final String titulo;
    protected final int ano;

    public ItemBiblioteca(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    public abstract int calcularPrazoEmprestimo();
}
