package models.questao13;

public class CursoEAD extends Curso {

    public CursoEAD(String nome, double cargaHoraria) {
        super(nome, cargaHoraria);
    }

    @Override
    public double calcularMensalidade() {
        return 10.0 * cargaHoraria;
    }
}
