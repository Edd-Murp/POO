package models.questao13;

public class CursoPresencial extends Curso {

    public CursoPresencial(String nome, double cargaHoraria) {
        super(nome, cargaHoraria);
    }

    @Override
    public double calcularMensalidade() {
        return 20.0 * cargaHoraria;
    }
}
