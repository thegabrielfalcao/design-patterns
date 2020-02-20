package br.com.thegabrielfalcao.designpatterns.templatemethod.refactoringguru.networks;

/**
 * Classe de exemplo abstrata para a rede
 */
public abstract class Network {

    protected String userName;
    protected String password;

    /**
     * Este é o Template Method, ele contém um conjunto de passos que foram abstraídos para que os
     * filhos dessa classe possam implementar de sua forma
     */
    public boolean post(String message) {
        if (logIn(this.userName, this.password)) {
            boolean result = sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    protected abstract boolean logIn(String userName, String password);
    protected abstract boolean sendData(byte[] data);
    protected abstract void logOut();
}
