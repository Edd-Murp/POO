package models;

public class Notebook implements Emprestavel {
    private String modelo;
    private boolean emprestado;

    public Notebook(String modelo) {
        this.modelo = modelo;
        this.emprestado = false;
    }

    @Override
    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
            System.out.println("Notebook '" + modelo + "' emprestado com sucesso.");
        } else {
            System.out.println("Notebook '" + modelo + "' já está emprestado.");
        }
    }

    @Override
    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println("Notebook '" + modelo + "' devolvido com sucesso.");
        } else {
            System.out.println("Notebook '" + modelo + "' não estava emprestado.");
        }
    }

    @Override
    public boolean estaEmprestado() {
        return emprestado;
    }
    
}
