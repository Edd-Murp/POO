package Parte1;
import java.util.ArrayList;
import java.util.stream.Gatherer;

import Parte1.models.Aluno;
import Parte1.models.Alunos;
import Parte1.models.Cachorro;
import Parte1.models.Funcionarios;
import Parte1.models.Gato;
import Parte1.models.Gerente;
import Parte1.models.Produto;
import Parte1.models.Professor;
import Parte1.models.Vendedor;

public class Main {
    public static void main(String[] args) {
        // 1
        Produto p1 = new Produto(1, "a", 10);
        Produto p2 = new Produto(1, "an", 10);
        if (p1.equals(p2)) {
            System.out.println("Produtos iguais!");
        } else {
            System.out.println("Produtos diferentes!");
        }

        // 2
        ArrayList<Alunos> alunos = new ArrayList<>();
        Alunos a1 = new Alunos(1, "Abu", "BCC");
        Alunos a2 = new Alunos(1, "Abu", "BCC");
        Alunos a3 = new Alunos(2, "Abu", "BCC");
        if (a1.equals(a2)) {
            System.out.println("\nAluno 1 e Aluno 2 são iguais!");
        } else {
            System.out.println("\nAluno 1 e Aluno 2 não são iguais!");
        }
        if (a2.equals(a3)) {
            System.out.println("\nAluno 2 e Aluno 3 são iguais!");
        } else {
            System.out.println("\nAluno 2 e Aluno 3 não são iguais!");
        }
        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);
        if (alunos.contains(a3)) {
            System.out.println("\nA lista contém o Aluno.");
        } else {
            System.out.println("\nA lista não contém o Aluno.");
        }

        // 3
        Aluno A1 = new Aluno("1", "a", 1);
        Aluno A2 = new Aluno("1", "a", 1);
        Professor P1 = new Professor("1", "a", "");
        Professor P2 = new Professor("1", "a", "");
        if (A1.equals(A2)) {
            System.out.println("\nAluno 1 e Aluno 2 são iguais!");
        } else {
            System.out.println("\nAluno 1 e Aluno 2 não são iguais!");
        }
        if (P1.equals(P2)) {
            System.out.println("\nProfessor 1 e Professor 2 são iguais!");
        } else {
            System.out.println("\nProfessor 1 e Professor 2 não são iguais!");
        }

        //4
        Gato g1 = new Gato(1,"");
        Cachorro c1 = new Cachorro(1, "");
        if (g1.equals(c1)) {
            System.out.println("\nOs animais são iguais!");
        }else{ System.out.println("\nOs animais não são iguais!");}
        
        //5
        Gerente G1 = new Gerente(1, null, 0, 0);
        Gerente G2 = new Gerente(1, "a", 0, 0);
        Vendedor V1 = new Vendedor(3, null, 0, 0);
        Vendedor V2 = new Vendedor(2, "a", 0, 0);
        ArrayList<Funcionarios> a = new ArrayList<>();
        a.add(G1);
        a.add(G2);
        a.add(V1);
        a.add(V2);
        for (Funcionarios funcionario : a) {
            System.out.println("\n"+ funcionario);
        }

        Funcionarios funcionario1 = new Funcionarios(1, null, 0);
        if (a.contains(funcionario1)) {
            System.out.println("\nContém funcionário 1");
        }else{
            System.out.println("\nNão contém funcionário 1");
        }
    }




}