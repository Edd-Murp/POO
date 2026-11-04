//Edu Dagnoni Mazureck
package models;

import java.util.ArrayList;

public class Cliente{
    
    private ArrayList<Ativo> carteira = new ArrayList<>();
    private String nome;

    public Cliente(String nome) {
        setNome(nome);
    }
    
    public void adicionarAtivo(Ativo ativo){
        if(ativo == null){
         throw new IllegalArgumentException("Ativo é nulo");   
        }
        carteira.add(ativo);
    }
    public void removerAtivo(Ativo ativo){
        if(ativo == null ){
         throw new IllegalArgumentException("Ativo é nulo");   
        }
        if(carteira.contains(ativo)){
            carteira.remove(ativo);
        }else{
           throw new IllegalArgumentException("Esse ativo não existe na carteira"); 
        }
        
    }

    public double calcularRendimentos(){
        double rendimento = 0;
        for (Ativo ativo : carteira) {
            rendimento += ativo.calcularRendimento();
        }
        return rendimento;
    }

    public double calcularValorInvestido(){
        double valorInvestido = 0;
        for (Ativo ativo : carteira) {
            valorInvestido += ativo.calcularValorInvestido();
        }
        return valorInvestido;
    }

    public ArrayList<Ativo> getCarteira() {
        return carteira;
    }

    public void setCarteira(ArrayList<Ativo> carteira) {
        this.carteira = carteira;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.isBlank()) {
              throw new IllegalArgumentException("Valor para o campo nome de Cliente está incorreto");
        }
        this.nome = nome;
    }
    


    

}
