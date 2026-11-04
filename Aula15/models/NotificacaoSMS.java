package models;

public class NotificacaoSMS implements Notificador{

    private String destinatario;

    public NotificacaoSMS(String destinatario) {
        this.destinatario = destinatario;
    }



    @Override
    public void enviar(String mensagem) throws FalhaNotificacaoException {
        String numeroNormalizado = destinatario == null
                ? ""
                : destinatario.replaceAll("[\\s()-]", "");
        if (!numeroNormalizado.matches("\\+?\\d{7,15}")) {
            throw new FalhaNotificacaoException("Número de telefone inválido: " + destinatario);
        }

        System.out.println("Mensagem enviada via SMS para " + destinatario + ": " + mensagem);
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    
}
