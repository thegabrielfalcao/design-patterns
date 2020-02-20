package br.com.thegabrielfalcao.designpatterns.chainofresponsability.anothergabrielfalcao.handlers.impl;

import br.com.thegabrielfalcao.designpatterns.chainofresponsability.anothergabrielfalcao.handlers.ResponsabilityChain;
import br.com.thegabrielfalcao.designpatterns.chainofresponsability.anothergabrielfalcao.model.impl.It;
import br.com.thegabrielfalcao.designpatterns.chainofresponsability.anothergabrielfalcao.model.impl.Reclamation;

public class ItHandler extends ResponsabilityChain {
    @Override
    public void resolve(Reclamation reclamation) {

        if (reclamation.getResponsable() instanceof It) {
            new It().treatReclamation(reclamation);
        } else {
            nextChainResolve(reclamation);
        }
    }
}
