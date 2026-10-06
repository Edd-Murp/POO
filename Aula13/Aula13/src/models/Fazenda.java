package models;

import java.util.ArrayList;

public class Fazenda {
    ArrayList<Animal> animais;


    public void todosEmitemSom(){
        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}
