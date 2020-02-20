package br.com.thegabrielfalcao.designpatterns.chainofresponsability.refactoringguru.middleware;

import br.com.thegabrielfalcao.designpatterns.chainofresponsability.refactoringguru.server.Server;

/**
 * Handler concreto herdando do Middleware, ele irá fazer sua implementação e chamar o próximo handler concreto
 */
public class UserExistsMiddleware extends Middleware {

    private Server server;

    public UserExistsMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("This email is not registered!");
            return false;
        }

        if (!server.isValidPassword(email, password)) {
            System.out.println("Wrong password");
            return false;
        }

        return checkNext(email, password);
    }
}
