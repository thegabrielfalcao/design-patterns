package br.com.thegabrielfalcao.designpatterns.chainofresponsability.refactoringguru;

import br.com.thegabrielfalcao.designpatterns.chainofresponsability.refactoringguru.middleware.Middleware;
import br.com.thegabrielfalcao.designpatterns.chainofresponsability.refactoringguru.middleware.RoleCheckMiddleware;
import br.com.thegabrielfalcao.designpatterns.chainofresponsability.refactoringguru.middleware.ThrottlingMiddleware;
import br.com.thegabrielfalcao.designpatterns.chainofresponsability.refactoringguru.middleware.UserExistsMiddleware;
import br.com.thegabrielfalcao.designpatterns.chainofresponsability.refactoringguru.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    public static void init() {

        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        Middleware middleware = new ThrottlingMiddleware(2);

        middleware.linkWith(new UserExistsMiddleware(server)).linkWith(new RoleCheckMiddleware());

        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;

        do {
            System.out.println("Enter email: ");
            String email = reader.readLine();
            System.out.println("Input password");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }
}
