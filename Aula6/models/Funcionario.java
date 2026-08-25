package models;
public class Funcionario {
    
    private String nome;
    private String cargo;
    private double salario;
    private Departamento departamento;
    private static int percentualReajusteGeral = 0;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        setSalario(salario);
    }

    
    //Getter and Setter
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        if(salario < 0){
            throw new RuntimeException("Salário não pode ser negativo.");
        }else{
            this.salario = salario + (salario * (percentualReajusteGeral / 100));
        }
    }
    public Departamento getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    public static int getPercentualReajusteGeral() {
        return percentualReajusteGeral;
    }
    public static void setPercentualReajusteGeral(int percentualReajusteGeral) {
        Funcionario.percentualReajusteGeral = percentualReajusteGeral;
    }

    
    //Métodos
    public void aumentarSalario(double percentual) {
        this.salario += this.salario * (percentual / 100);
    }
    public void aumentarSalario(double percentual, double adicional) {
        this.salario += (this.salario * (percentual / 100)) + adicional;
    }

    
}
