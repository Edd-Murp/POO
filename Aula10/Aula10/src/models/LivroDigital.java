package models;

public class LivroDigital extends Livro {
    private double tamanhoArquivo;

    public LivroDigital(String titulo, String autor, double preco, double tamanhoArquivo) {
        super(titulo, autor, preco);
        this.tamanhoArquivo = tamanhoArquivo;
    }
}
