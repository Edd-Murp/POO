public static void main(String[] args) {
    
}

/**
 * teste
 */
public class teste {

    private String nome;

    public teste(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "teste [nome=" + nome + "]";
    }

    
}