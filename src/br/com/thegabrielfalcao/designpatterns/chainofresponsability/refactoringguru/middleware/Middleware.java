package br.com.thegabrielfalcao.designpatterns.chainofresponsability.refactoringguru.middleware;

/**
 * Classe responsável por conter todo código boilerplate, e das quais todos os handlers irão herdar
 */
public abstract class Middleware {

    private Middleware next;

    public Middleware linkWith(Middleware next) {
        this.next = next;
        return next;
    }

    /**
     * Método que conterá a implementação de cada handler concreto que extender essa classe
     *
     * @param email
     * @param password
     * @return
     */
    public abstract boolean check(String email, String password);

    /**
     *
     * Método que chamará o método check(), além de parar a cadeia caso seja nulo. Nesse caso ele para devolvendo false
     *
     * @param email
     * @param password
     * @return
     */
    protected boolean checkNext(String email, String password) {

        if (next == null) {
            return false;
        }

        return next.check(email, password);
    }
}
