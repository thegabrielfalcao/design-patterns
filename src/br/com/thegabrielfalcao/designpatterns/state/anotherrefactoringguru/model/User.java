package br.com.thegabrielfalcao.designpatterns.state.anotherrefactoringguru.model;

public class User {

    private boolean isAdmin;

    public User(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public boolean isAdmin() {
        return isAdmin;
    }
}
