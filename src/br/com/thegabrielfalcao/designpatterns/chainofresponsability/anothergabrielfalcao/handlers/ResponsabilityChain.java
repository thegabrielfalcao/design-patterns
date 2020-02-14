package br.com.thegabrielfalcao.designpatterns.chainofresponsability.anothergabrielfalcao.handlers;

import br.com.thegabrielfalcao.designpatterns.chainofresponsability.anothergabrielfalcao.model.impl.Reclamation;

public abstract class ResponsabilityChain {

    private ResponsabilityChain chain;

    public ResponsabilityChain linkWith(ResponsabilityChain chain) {
        this.chain = chain;
        return chain;
    }

    public abstract void resolve(Reclamation reclamation);

    protected void nextChainResolve(Reclamation reclamation) {

        if (chain != null) {
            chain.resolve(reclamation);
        } else {
            System.out.println("Nobody's problem, contact another department!");
        }
    }
}
