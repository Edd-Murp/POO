import models.Aluno;
import models.Gerente;
import models.Carro;

public class App {

    public static void main(String[] args) {
        //1
        Aluno aluno = new Aluno("João", 20, "12345");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + aluno.getIdade());
        System.out.println("Matrícula: " + aluno.getMatricula()+"\n");

        //23
        Gerente gerente = new Gerente("Maria", 5000.0, 1000.0);
        /*
        Pessoa criada
        Funcionario criado
        Gerente criado
        Explicação: pra criar um gerente, primeiro é necessário criar uma pessoa, depois um funcionário e por último o gerente. Por isso a ordem das mensagens de criação é essa.
        */

        //24 - Herança Indireta
        Carro carro = new Carro("Toyota", "Corolla", 2023, 140.0, "Gasolina", 4);
        System.out.println("\nInformações do Carro:");
        carro.exibirQuantidadePortas();

        //25 - Atributos Privados da Superclasse
        Gerente gerente2 = new Gerente("Carlos", 3000.0, 500.0);
        
        System.out.println("\nSalário do Gerente: " + gerente2.getSalario());
        gerente2.setSalario(4000.0);
        System.out.println("Novo Salário: " + gerente2.getSalario());
        System.out.println("Bônus: " + gerente2.getBonus());
        System.out.println("Salário Total (salário + bônus): " + gerente2.calcularSalarioTotal());
        
        /*
        EXPLICAÇÃO:
        O atributo 'salario' é declarado como PRIVADO (private) na classe Funcionario.
        Isso significa que o atributo só pode ser acessado diretamente dentro da própria classe Funcionario.
        E subclasse não herda acesso direto aos atributos privados da superclasse. Por isso, quando tentamos acessar 'salario' diretamente na subclasse Gerente, ocorre um erro de compilação.
        */

        
    }
}