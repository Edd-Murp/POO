package models;

public class Produto {

    private Pessoa comprador;
    private Fabricante fabricante;
    private String nome;
    private double preco;
    private int qntd;
    private boolean disponivel;
    private static int totalProdutosCriados = 0;

    public Produto(String nome, double preco, int qntd, Fabricante fabricante) {
        this.nome = nome;
        this.fabricante = fabricante;
        setPreco(preco);
        setQntd(qntd);
        totalProdutosCriados++;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.qntd = 0;
        totalProdutosCriados++;
    }

    public Produto(String nome, double preco, int qntd) {
        this.nome = nome;
        setPreco(preco);
        setQntd(qntd);
        totalProdutosCriados++;
    }


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
    public static int getTotalProdutosCriados() {
        return totalProdutosCriados;
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
        if (preco < 0) {
            throw new RuntimeException("Preço não pode ser negativo");
        }else{
            this.preco = preco;
        }
    }
    public void setQntd(int qntd) {
        if (qntd < 0) {
            throw new RuntimeException("Quantidade não pode ser negativa");
        }else{
            this.qntd = qntd;
        }
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    public static void setTotalProdutosCriados(int totalProdutosCriados) {
        Produto.totalProdutosCriados = totalProdutosCriados;
    }   

    //Methods
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
        return fabricante.getNome();
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

    public void aplicaDesconto(double percentual) {
        if (percentual < 0 || percentual > 100) {
            throw new IllegalArgumentException("Percentual de desconto inválido");
        }
        preco -= preco * (percentual / 100);
    }

    public void aplicaDesconto(double percentual, double descontoAdicional){
        if (percentual < 0 || percentual > 100) {
            throw new IllegalArgumentException("Percentual de desconto inválido");
        }
        if (descontoAdicional < 0 || descontoAdicional > 100) {
            throw new IllegalArgumentException("Desconto adicional inválido");
        }
        preco -= (preco * (percentual / 100) + preco * (descontoAdicional / 100));
    }

    public static double calcularPrecoComDesconto(double preco, double percentual){
        if (percentual < 0 || percentual > 100) {
            throw new RuntimeException("Percentual de desconto inválido");
        }
        if( preco < 0) {
            throw new RuntimeException("Preço inválido");
        }
        preco -= preco * (percentual / 100);
        return preco;
    }

    
    
}
