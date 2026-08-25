package models;

public class Pessoa {
    
    private String nome;
    private int idade;
    private double altura;
    private boolean maiorDeIdade;
    private static int qntdPessoas = 0;


    public Pessoa(String nome, int idade) {
        this.nome = nome;
        setIdade(idade);
        qntdPessoas++;
    }
    
    public Pessoa(String nome) {
        this.nome = nome;
        setIdade(0);
    }

    //Getters
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public double getAltura() {
        return altura;
    }
    public boolean isMaiorDeIdade() {
        return maiorDeIdade;
    }
    public static int getQntdPessoas() {
        return qntdPessoas;
    }

    //Setter
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        if(idade >= 0){
            this.idade = idade;
        }else{
            throw new RuntimeException("Idade não pode ser negativa.");
        }

    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setMaiorDeIdade(boolean maiorDeIdade) {
        this.maiorDeIdade = maiorDeIdade;
    }
    public static void setQntdPessoas(int qntdPessoas) {
        Pessoa.qntdPessoas = qntdPessoas;
    }
    
    //Metódos Customizados
    public String msg(String nome, int idade) {
        String msg = nome + " possui " + idade + " anos.";
        return msg;
    }

    public void aumentarIdade(){
        idade++;
    }
    
    public void apresentar(){
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }
    public void apresentar(String mensagem){
        System.out.println(mensagem);
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
    }

}
