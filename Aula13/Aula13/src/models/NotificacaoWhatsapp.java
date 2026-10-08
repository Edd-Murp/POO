package models;

public class NotificacaoWhatsapp extends Notificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando notificação por WhatsApp: " + mensagem);
    }
    
}
