package Parte4.Utils;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import Parte4.models.Aluno;
import Parte4.models.Produto;

public class ArquivoRepositorio {
    
    public void gravarArquivo(){
        File arquivo = new File("Parte4/dados.bin");
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        try {
            fos = new FileOutputStream(arquivo);
            dos = new DataOutputStream(fos);
            dos.writeInt(25);
            dos.writeDouble(199.90);
            dos.writeBoolean(true);
            dos.writeUTF("Java");
        } catch (Exception e) {
            System.out.println("Erro ao gravar o arquivo: " + e.getMessage());
        } finally {
            try {
                if (dos != null) {
                    dos.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (Exception e) {
               System.out.println("Erro ao fechar o arquivo: " + e.getMessage());
            }
        }
    }

    public void lerArquivo() {
        File arquivo = new File("Parte4/dados.bin");
        FileInputStream fis = null;
        DataInputStream dis = null;
        try {
            fis = new FileInputStream(arquivo);
            dis = new DataInputStream(fis);
            int numero = dis.readInt();
            double valor = dis.readDouble();
            boolean flag = dis.readBoolean();
            String texto = dis.readUTF();
            System.out.println("Número: " + numero);
            System.out.println("Valor: " + valor);
            System.out.println("Flag: " + flag);
            System.out.println("Texto: " + texto);
        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        } finally {
            try {
                if (dis != null) {
                    dis.close();
                }
                if (fis != null) {
                    fis.close();
                }
            } catch (Exception e) {
                System.out.println("Erro ao fechar o arquivo: " + e.getMessage());
            }
        }
    }

    public void gravarFuncionario(int matricula, String nome, double salario, boolean ativo){
        File arquivo = new File("Parte4/funcionarios.bin");
        try {
            if (!arquivo.exists()) {
                arquivo.createNewFile();
            }
        } catch (Exception e) {
            System.out.println("Erro ao criar o arquivo: " + e.getMessage());
        }
        try (FileOutputStream fos = new FileOutputStream(arquivo);
            DataOutputStream dos = new DataOutputStream(fos)) {
            dos.writeInt(matricula);
            dos.writeUTF(nome);
            dos.writeDouble(salario);
            dos.writeBoolean(ativo);
        } catch (Exception e) {
           System.out.println("Erro no gravamento do Funcionário :" + e.getMessage());
        }
    }

    public void lerFuncionario(){
        File arquivo = new File("Parte4/funcionarios.bin");
        try (FileInputStream fos = new FileInputStream(arquivo); 
            DataInputStream dos = new DataInputStream(fos)) {
            int matricula = dos.readInt();
            String nome = dos.readUTF();
            double salario = dos.readDouble();
            boolean ativo = dos.readBoolean();
            System.out.println("Matrícula: " + matricula);
            System.out.println("Nome: " + nome);
            System.out.println("Salário: " + salario);
            System.out.println("Ativo: " + ativo);
        } catch (Exception e) {
            System.out.println("Erro ao ler o funcionário: " + e.getMessage());
        }
    }

    public void gravarProduto(Produto[] produto){
        File arquivo = new File("Parte4/produtos.bin");
        try {
            if (!arquivo.exists()) {
                arquivo.createNewFile();
            }
        } catch (Exception e) {
            System.out.println("Erro ao criar o arquivo: " + e.getMessage());
        }
        try (FileOutputStream fos = new FileOutputStream(arquivo);
            DataOutputStream dos = new DataOutputStream(fos)) {
            for (Produto p : produto) {
                dos.writeInt(p.getCodigo());
                dos.writeUTF(p.getNome());
                dos.writeDouble(p.getPreco());
            }
        } catch (Exception e) {
            System.out.println("Erro no gravamento do Produto :" + e.getMessage());
        }
    }

    public void lerProduto(){
        File arquivo = new File("Parte4/produtos.bin");
        try (FileInputStream fis = new FileInputStream(arquivo);
            DataInputStream dis = new DataInputStream(fis)) {
            while (dis.available() > 0) {
                int codigo = dis.readInt();
                String nome = dis.readUTF();
                double preco = dis.readDouble();
                System.out.println("Código: " + codigo);
                System.out.println("Nome: " + nome);
                System.out.println("Preço: " + preco);
            }
        } catch (Exception e) {
            System.out.println("Erro ao ler o produto: " + e.getMessage());
        }
    }

    public void gravarAluno(Aluno[] aluno){
        File arquivo = new File("Parte4/alunos.bin");
        try {
            if (!arquivo.exists()) {
                arquivo.createNewFile();
            }
        } catch (Exception e) {
            System.out.println("Erro ao criar o arquivo: " + e.getMessage());
        }
        try (FileOutputStream fos = new FileOutputStream(arquivo, true);
            DataOutputStream dos = new DataOutputStream(fos)) {
            for (Aluno a : aluno) {
                dos.writeInt(a.getMatricula());
                dos.writeUTF(a.getNome());
                dos.writeInt(a.getIdade());
            }
        } catch (Exception e) {
            System.out.println("Erro no gravamento do Aluno :" + e.getMessage());
        }
    }

    public void lerAluno(){
        File arquivo = new File("Parte4/alunos.bin");
        try (FileInputStream fis = new FileInputStream(arquivo);
            DataInputStream dis = new DataInputStream(fis)) {
            while (dis.available() > 0) {
                int matricula = dis.readInt();
                String nome = dis.readUTF();
                int idade = dis.readInt();
                System.out.println("Matrícula: " + matricula);
                System.out.println("Nome: " + nome);
                System.out.println("Idade: " + idade);
            }
        } catch (Exception e) {
            System.out.println("Erro ao ler o aluno: " + e.getMessage());
        }
    }

    public void gravarRelatorio(String nomeEmpresa, int qtdFuncionarios, double faturamento, boolean ativo, int anoFundacao) {
        File arquivo = new File("Parte4/relatorios.bin");
        try {
            if (!arquivo.exists()) {
                arquivo.createNewFile();
            }
        } catch (Exception e) {
            System.out.println("Erro ao criar o arquivo: " + e.getMessage());
        }
        try (FileOutputStream fos = new FileOutputStream(arquivo, true);
            DataOutputStream dos = new DataOutputStream(fos)) {
            dos.writeUTF(nomeEmpresa);
            dos.writeInt(qtdFuncionarios);
            dos.writeDouble(faturamento);
            dos.writeBoolean(ativo);
            dos.writeInt(anoFundacao);
        } catch (Exception e) {
            System.out.println("Erro no gravamento do Relatório :" + e.getMessage());
        }
    }

    public void lerRelatorio() {
        File arquivo = new File("Parte4/relatorios.bin");
        try (FileInputStream fis = new FileInputStream(arquivo);
            DataInputStream dis = new DataInputStream(fis)) {
            while (dis.available() > 0) {
                String nomeEmpresa = dis.readUTF();
                int qtdFuncionarios = dis.readInt();
                double faturamento = dis.readDouble();
                boolean ativo = dis.readBoolean();
                int anoFundacao = dis.readInt();
                System.out.println("Nome da Empresa: " + nomeEmpresa);
                System.out.println("Quantidade de Funcionários: " + qtdFuncionarios);
                System.out.println("Faturamento: " + faturamento);
                System.out.println("Ativo: " + ativo);
                System.out.println("Ano de Fundação: " + anoFundacao);
            }
        } catch (Exception e) {
            System.out.println("Erro ao ler o relatório: " + e.getMessage());
        }
    }
}