package Parte2.models;

public class PessoaFisica extends Cliente{

    private String CPF;
    private int dataNascimento;

    public PessoaFisica(int codigo, String nome, String email) {
        super(codigo, nome, email);
        //TODO Auto-generated constructor stub
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
 
    
}
