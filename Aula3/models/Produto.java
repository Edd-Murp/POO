package models;

public class Produto {

    public Pessoa comprador;
    public Fabricante fabricante;
    public String nome;
    public double preco;
    public int qntd;
    public boolean disponivel;
    
    
    public Pessoa getComprador() {
        return comprador;
    }
    public Fabricante getFabricante() {
        return fabricante;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQntd() {
        return qntd;
    }
    public boolean isDisponivel() {
        return disponivel;
    }

    public void indisponivel(){
        disponivel = false;
    }    
    public void disponivel(){
        disponivel = true;
    }

    public void aumentarEstoque(){
        qntd++;
    }

    public String checarEstoque(){
        if (qntd == 0) {
            return "Produto sem estoque";
        }else{
            return "Produto em estoque";
        }
    }

    public boolean isEstoqueDisponivel(){
        if (qntd >= 0 && disponivel == true) {
            return true;
        }else{
            
            return false;
        }
    }

    public String getFabricantName(){
        return fabricante.nome;
    }
   
    public String descrição() {
        return "Produto [comprador=" + comprador + ", fabricante=" + fabricante + ", nome=" + nome + "]";
    }

    public void venda(){
        if (qntd > 0) {
            qntd--;
            if (qntd == 0) {
                indisponivel();
            }
        }else{
            System.out.println("Produto indisponivel");
        }
    }

    
}
