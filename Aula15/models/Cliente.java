package models;

public class Cliente extends Usuario implements Autenticavel{

    public Cliente(String nome, String senha) {
        super(nome, senha);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void autenticar() throws IllegalArgumentException{
        if (!getNome().equals("A") || !getSenha().equals("123")) {
            throw new IllegalArgumentException("Há algum erro nas credenciais!");
        }else{
            System.out.println("Cliente autenticado!"); 
        }
         
       
    }
    

}
