package br.com.thegabrielfalcao.designpatterns.chainofresponsability.anothergabrielfalcao.handlers.impl;

import br.com.thegabrielfalcao.designpatterns.chainofresponsability.anothergabrielfalcao.handlers.ResponsabilityChain;
import br.com.thegabrielfalcao.designpatterns.chainofresponsability.anothergabrielfalcao.model.impl.HumanResources;
import br.com.thegabrielfalcao.designpatterns.chainofresponsability.anothergabrielfalcao.model.impl.Reclamation;

public class HumanResourcesHandler extends ResponsabilityChain {
    @Override
    public void resolve(Reclamation reclamation) {
        if (reclamation.getResponsable() instanceof HumanResources) {
            new HumanResources().treatReclamation(reclamation);
        } else {
            nextChainResolve(reclamation);
        }
    }
}
