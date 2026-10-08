package models;

public class NotificacaoEmail extends Notificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando notificação por e-mail: " + mensagem);
    }
    
}
