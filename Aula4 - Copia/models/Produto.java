package models;

public class Produto {

    public Pessoa comprador;
    public Fabricante fabricante;
    public String nome;
    public double preco;
    public int qntd;
    public boolean disponivel;
    
//Getters    
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

    //Setters
    public void setComprador(Pessoa comprador) {
        this.comprador = comprador;
    }
    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setQntd(int qntd) {
        this.qntd = qntd;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
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
