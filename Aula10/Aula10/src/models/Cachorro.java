package models;

public class Cachorro extends Animal {

    private String raca;

    public Cachorro(String name, int age, String raca) {
        super(name, age);
        this.raca = raca;
    }
    
}
