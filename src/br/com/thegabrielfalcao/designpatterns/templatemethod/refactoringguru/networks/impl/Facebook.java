package br.com.thegabrielfalcao.designpatterns.templatemethod.refactoringguru.networks.impl;

import br.com.thegabrielfalcao.designpatterns.templatemethod.refactoringguru.networks.Network;

/**
 * Rede Social concreta, onde serão sobreescritos os métodos abstratos da classe pai, porém será chamado para
 * o mundo exterior dessa classe apenas o template method do pai
 */
public class Facebook extends Network {

    public Facebook(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    /**
     * Interessante notar nesse método que podemos ver que o simulateNetworkLatency() não faz parte do template method,
     * entretanto como dito anteriormente cada filho terá sua implementação, e no caso do login do facebook teríamos esse passo a mais
     * dentro de um dos passos do template method
     */
    @Override
    protected boolean logIn(String userName, String password) {
        System.out.println("\nChecking user's parameters");
        System.out.println("Name: " + this.userName);
        System.out.println("Password: ");
        for (int i = 0; i < this.password.length(); i++) {
            System.out.print("*");
        }
        simulateNetworkLatency();
        System.out.println("\n\nLogIn success on Facebook");
        return true;
    }

    @Override
    protected boolean sendData(byte[] data) {
        boolean messagePosted = true;
        if (messagePosted) {
            System.out.println("Message: '" + new String(data) + "' was posted on Facebook");
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected void logOut() {
        System.out.println("User: '" + userName + "' was logged out from Facebook");
    }

    private void simulateNetworkLatency() {
        try {
            int i = 0;
            System.out.println();
            while (i < 10) {
                System.out.print(".");
                Thread.sleep(500);
                i++;
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
