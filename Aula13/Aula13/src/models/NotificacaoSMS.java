package models;

public class NotificacaoSMS extends Notificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando notificação por SMS: " + mensagem);
    }
    
}
