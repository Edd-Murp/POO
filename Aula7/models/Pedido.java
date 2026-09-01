package models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {
    private int numero;
    private LocalDate data;
    private double valorTotal;
    private ArrayList<Produto> produtos;
}
