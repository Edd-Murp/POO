package models;

public class Administrador extends Usuario implements Autenticavel{

    private int id;

    public Administrador(String nome, String senha, int id) {
        super(nome, senha);
        this.id = id;
    }

    @Override
    public void autenticar() throws IllegalArgumentException {
       if (!getNome().equals("A") || !getSenha().equals("123") || id != 1) {  
            throw new IllegalArgumentException("Há algum erro nas credenciais!");  
        }else{
            System.out.println("Administrador autenticado!");
        }
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
