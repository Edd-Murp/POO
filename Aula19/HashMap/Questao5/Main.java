package HashMap.Questao5;

import java.util.HashMap;
import java.util.Map;

import HashMap.Questao5.models.Funcionario;

public class Main {
    public static void main(String[] args) {
        Map<Funcionario, Double> salarios = new HashMap<>();
        salarios.put(new Funcionario(301, "Ana"), 4500.00);
        salarios.put(new Funcionario(302, "Bruno"), 5200.00);
        salarios.put(new Funcionario(303, "Carla"), 4800.00);
        salarios.put(new Funcionario(304, "Daniel"), 6100.00);
        salarios.put(new Funcionario(305, "Elisa"), 5000.00);

        Funcionario consulta = new Funcionario(303, "Carla");
        System.out.println("Salário pela matrícula 303: " + salarios.get(consulta));
        System.out.println("A chave encontrada é equivalente? "
                + salarios.keySet().stream().anyMatch(consulta::equals));
        System.out.println("Quantidade de funcionários no mapa: " + salarios.size());
        System.out.println("equals() compara as matrículas e hashCode() gera o mesmo código "
                + "para matrículas iguais. Assim, o HashMap encontra chaves representadas "
                + "por objetos diferentes com a mesma matrícula.");
    }
}
