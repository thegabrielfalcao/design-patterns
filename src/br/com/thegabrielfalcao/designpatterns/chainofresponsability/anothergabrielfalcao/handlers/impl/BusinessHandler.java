package br.com.thegabrielfalcao.designpatterns.chainofresponsability.anothergabrielfalcao.handlers.impl;

import br.com.thegabrielfalcao.designpatterns.chainofresponsability.anothergabrielfalcao.handlers.ResponsabilityChain;
import br.com.thegabrielfalcao.designpatterns.chainofresponsability.anothergabrielfalcao.model.impl.Business;
import br.com.thegabrielfalcao.designpatterns.chainofresponsability.anothergabrielfalcao.model.impl.Reclamation;

public class BusinessHandler extends ResponsabilityChain {

    @Override
    public void resolve(Reclamation reclamation) {
        if (reclamation.getResponsable() instanceof Business) {
            new Business().treatReclamation(reclamation);
        } else {
            nextChainResolve(reclamation);
        }
    }
}
