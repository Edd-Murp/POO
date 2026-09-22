package models;

public class VeiculoMotorizado extends Veiculo {
    private double potenciaMotor;
    private String tipoCombustivel;

    public VeiculoMotorizado() {
    }

    public VeiculoMotorizado(String marca, String modelo, int ano, double potenciaMotor, String tipoCombustivel) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAno(ano);
        this.potenciaMotor = potenciaMotor;
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(double potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public void exibirEspecificacoes() {
        System.out.println("Potência do Motor: " + potenciaMotor + " CV");
        System.out.println("Tipo de Combustível: " + tipoCombustivel);
    }
}
