package models.questao07;

public class Vaca extends Animal {

    public Vaca(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String emitirSom() {
        return "Muuu";
    }
}

