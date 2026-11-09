package Parte1.models;

public class Pessoa {
    private String cpf;
    private String nome;
    
    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean equals(Pessoa pessoa) {
        return java.util.Objects.equals(this.nome, pessoa.nome);
    }

    
}
