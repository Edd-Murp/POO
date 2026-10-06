package models.questao16;

public class Livro extends ItemBiblioteca {

    public Livro(String titulo, int ano) {
        super(titulo, ano);
    }

    @Override
    public int calcularPrazoEmprestimo() {
        return 15;
    }
}
