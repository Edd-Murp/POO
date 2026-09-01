package models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Livro {
    private int isbn;
    private String titulo;
    private LocalDate anoPublicacao;
    private Biblioteca biblioteca;
    private ArrayList<Autor> autores;
}
