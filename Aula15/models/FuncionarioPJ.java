package models;

public class FuncionarioPJ extends Funcionario{
    
    @Override
    public void calcularPagamento() {
        try {
            for (int i = 0; i < 10; i++) {
                setSalario(getSalario() / 2);
            }
            System.out.println(getSalario());
        } catch (Excecao e) {
            throw new RuntimeException(e);
        }
    }
}
