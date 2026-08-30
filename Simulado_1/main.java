import models.*;

public class main {
    
    public static void main(String[] args) {
        Aluguel aluguel = new Aluguel();
        Veiculo veiculo = new Veiculo();
        aluguel.setVeiculo(veiculo);
        aluguel.setQtdDias(3);
        aluguel.setQtdPassageiros(5);

        System.out.println("Valor total do aluguel: " + aluguel.calcularValorAluguel(aluguel));
    }
}
