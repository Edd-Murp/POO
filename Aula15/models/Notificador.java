package models;

public interface Notificador {
    void enviar(String mensagem) throws FalhaNotificacaoException;
}
