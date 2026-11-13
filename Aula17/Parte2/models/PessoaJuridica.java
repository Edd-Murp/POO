package Parte2.models;

public class PessoaJuridica extends Cliente{
    
    private int CNPJ;
    private String razaoSocial;
    
    public PessoaJuridica(int codigo, String nome, String email, int CNPJ, String razaoSocial) {
        super(codigo, nome, email);
        this.CNPJ = CNPJ;
        this.razaoSocial = razaoSocial;
    }

    public int getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(int cNPJ) {
        CNPJ = cNPJ;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    
}
