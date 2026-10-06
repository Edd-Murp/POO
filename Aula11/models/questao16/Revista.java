package models.questao16;

public class Revista extends ItemBiblioteca {

    public Revista(String titulo, int ano) {
        super(titulo, ano);
    }

    @Override
    public int calcularPrazoEmprestimo() {
        return 7;
    }
}
