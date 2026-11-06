package Parte1.repositories;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Parte1.models.Funcionario;

public class FuncionarioRepository {

    public void cadastrarFuncionario(String caminho, Funcionario funcionario) {
        File file = new File(caminho + "Parte1/funcionarios.bin");
        try (FileOutputStream fos = new FileOutputStream(file);
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(funcionario);
        } catch (Exception e) {
            System.out.println("Erro ao gravar o funcionário: " + e.getMessage());
        }
    }

    public void listarFuncionarios(String caminho) {
        File file = new File(caminho + "Parte1/funcionarios.bin");
        try (FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis)) {
            Funcionario funcionario = (Funcionario) ois.readObject();
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Matricula: " + funcionario.getMatricula());
            System.out.println("Salario: " + funcionario.getSalario());
        } catch (Exception e) {
            System.out.println("Erro na leitura do arquivo: " + e.getMessage());
        }
    }

    public void consultarFuncionarioPorMatricula(String caminho, int matricula) {
        File file = new File(caminho + "Parte1/funcionarios.bin");
        try (FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis)) {
            Funcionario funcionario = (Funcionario) ois.readObject();
            if (funcionario.getMatricula() == matricula) {
                System.out.println("Nome: "+ funcionario.getNome());
                System.out.println("Matricula: "+ funcionario.getMatricula());
                System.out.println("Salario: "+ funcionario.getSalario());
            }
        } catch (Exception e) {
            System.out.println("Erro ao consultar funcionário por matrícula: " + e.getMessage());
        }
    }

    public void consultarFuncionarioPorCargo(String caminho, String cargo) {
        File file = new File(caminho + "Parte1/funcionarios.bin");
        try (FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis)) {
            Funcionario funcionario = (Funcionario) ois.readObject();
            if (funcionario.getCargo().equals(cargo)) {
                System.out.println("Nome: "+ funcionario.getNome());
                System.out.println("Matricula: "+ funcionario.getMatricula());
                System.out.println("Salario: "+ funcionario.getSalario());
            }
        } catch (Exception e) {
            System.out.println("Erro ao consultar funcionário por matrícula: " + e.getMessage());
        }
    }

    public void calcularSomaDosFuncionarios(String caminho){
        File file = new File(caminho+"Parte1/funcionarios.bin");
        try (FileInputStream fis = new FileInputStream(file);
    ObjectInputStream ois = new ObjectInputStream(fis)) {
            Funcionario funcionario = (Funcionario) ois.readObject();
            System.out.println("Salarios:" + funcionario.getSalario());
        } catch (Exception e) {
            System.out.println("Erro ao calcular soma dos funcionarios: " + e.getMessage());
        }
        
    }
}
