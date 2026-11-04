package exercicios;

public final class Questao23 {
    private Questao23() {}

    public static class SistemaException extends Exception {
        public SistemaException(String message) { super(message); }
    }

    public static class UsuarioNaoEncontradoException extends SistemaException {
        public UsuarioNaoEncontradoException(String message) { super(message); }
    }

    public static class PermissaoNegadaException extends SistemaException {
        public PermissaoNegadaException(String message) { super(message); }
    }

    public static class ServicoUsuarios {
        public void buscarUsuario(boolean encontrado) throws UsuarioNaoEncontradoException {
            if (!encontrado) throw new UsuarioNaoEncontradoException("Usuário não encontrado.");
        }

        public void verificarPermissao(boolean autorizado) throws PermissaoNegadaException {
            if (!autorizado) throw new PermissaoNegadaException("Permissão negada.");
        }

        public void executarOperacao(boolean encontrado, boolean autorizado)
                throws UsuarioNaoEncontradoException, PermissaoNegadaException {
            buscarUsuario(encontrado);
            verificarPermissao(autorizado);
        }
    }

    public static void executar() {
        System.out.println("\n=== Questão 23 - Hierarquia de exceções ===");
        ServicoUsuarios servico = new ServicoUsuarios();
        executarComCatchEspecifico(servico, false, false);
        executarComCatchEspecifico(servico, true, false);

        try {
            servico.verificarPermissao(false);
        } catch (SistemaException e) {
            System.out.println("Tratamento pela superclasse: " + e.getMessage());
        }
        System.out.println("Catch de subclasses deve vir antes do catch da superclasse, que também as captura.");
    }

    private static void executarComCatchEspecifico(
            ServicoUsuarios servico, boolean encontrado, boolean autorizado) {
        try {
            servico.executarOperacao(encontrado, autorizado);
        } catch (UsuarioNaoEncontradoException e) {
            System.out.println("Usuário: " + e.getMessage());
        } catch (PermissaoNegadaException e) {
            System.out.println("Permissão: " + e.getMessage());
        }
    }
}
