package models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private ArrayList<Automovel> automoveis;
    private ArrayList<Pessoa> amizades;
}
