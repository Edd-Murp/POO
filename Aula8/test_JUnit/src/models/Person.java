package models;

public class Person {
	private String nome;
	private int idade;

	public Person() {
	}

	public Person(String nome, int idade) {
		setNome(nome);
		setIdade(idade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() < 2) {
			throw new IllegalArgumentException("Nome deve ter pelo menos 2 caracteres");
		}
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade < 0) {
			throw new IllegalArgumentException("Idade deve ser um valor positivo");
		}
		this.idade = idade;
	}

}
