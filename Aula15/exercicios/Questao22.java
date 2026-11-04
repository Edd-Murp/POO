package exercicios;

public final class Questao22 {
    private Questao22() {}

    public static class CpfInvalidoException extends Exception {
        public CpfInvalidoException(String message) { super(message); }
    }

    public static class CadastroPessoa {
        public void cadastrar(String cpf) throws CpfInvalidoException {
            if (!cpfValido(cpf)) {
                throw new CpfInvalidoException("CPF inválido.");
            }
            System.out.println("Pessoa cadastrada com CPF válido.");
        }

        private boolean cpfValido(String cpf) {
            if (cpf == null) return false;
            String digitos = cpf.replaceAll("\\D", "");
            if (!digitos.matches("\\d{11}") || digitos.chars().distinct().count() == 1) return false;
            int primeiro = calcularDigito(digitos, 9);
            int segundo = calcularDigito(digitos, 10);
            return digitos.charAt(9) - '0' == primeiro && digitos.charAt(10) - '0' == segundo;
        }

        private int calcularDigito(String cpf, int quantidade) {
            int soma = 0;
            for (int i = 0; i < quantidade; i++) {
                soma += (cpf.charAt(i) - '0') * (quantidade + 1 - i);
            }
            int resto = soma % 11;
            return resto < 2 ? 0 : 11 - resto;
        }
    }

    public static void executar() {
        System.out.println("\n=== Questão 22 - Validação de CPF ===");
        CadastroPessoa cadastro = new CadastroPessoa();
        for (String cpf : new String[] {"529.982.247-25", "111.111.111-11"}) {
            try {
                cadastro.cadastrar(cpf);
            } catch (CpfInvalidoException e) {
                System.out.println("Cadastro recusado: " + e.getMessage());
            }
        }
    }
}
