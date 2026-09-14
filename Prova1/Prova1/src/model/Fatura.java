package model;

public class Fatura {
    private String titular;
    private double kWhMes;
    private String consumidor;
    
    public Fatura(String titular, double kWhMes, String consumidor) {
        setTitular(titular);
        setkWhMes(kWhMes);
        setConsumidor(consumidor);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular == "" || titular == null) {
            throw new IllegalArgumentException();
        }
        this.titular = titular;
    }

    public double getkWhMes() {
        return kWhMes;
    }

    public void setkWhMes(double kWhMes) {
        if (kWhMes <= 0) {
            throw new IllegalArgumentException();
        }
        this.kWhMes = kWhMes;
    }

    public String getConsumidor() {
        return consumidor;
    }

    public void setConsumidor(String consumidor) {
        if (consumidor == null) {
            throw new IllegalArgumentException();
        }
        this.consumidor = consumidor;
    }
    

    //Fatura
    //Residencial, Comercial e Industrial
    public double calcularFatura(Fatura fatura){
        double valorTotal = 0;
        switch (fatura.consumidor) {
            case "Residencial":
                if (fatura.kWhMes > 200) {
                    valorTotal = (200*0.5) + ((fatura.kWhMes-200)*0.75);  
                }else{
                    valorTotal = fatura.kWhMes*0.5;
                }
                break;  

            case "Comercial":
                if (fatura.kWhMes > 800) {
                    valorTotal = (800*0.75) + (fatura.kWhMes-800);
                }else{
                    valorTotal = fatura.kWhMes*0.5;
                }
                break;

            case "Industrial":
                valorTotal = fatura.kWhMes*0.85;
                break;

            default:
                break;
        }
        return valorTotal;
    }
    
    

    
    
}