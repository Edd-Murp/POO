package models.questao07;

public abstract class Animal {
    protected final String nome;
    protected final int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public abstract String emitirSom();
}

