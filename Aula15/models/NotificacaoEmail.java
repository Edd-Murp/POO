package models;

public class NotificacaoEmail implements Notificador{

    private String destinatario;

    public NotificacaoEmail(String destinatario) {
        this.destinatario = destinatario;
    }

    @Override
    public void enviar(String mensagem) throws FalhaNotificacaoException {
        if (destinatario == null || !destinatario.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
            throw new FalhaNotificacaoException("Endereço de e-mail inválido: " + destinatario);
        }

        System.out.println("Mensagem enviada via e-mail para " + destinatario + ": " + mensagem);
    }
}
