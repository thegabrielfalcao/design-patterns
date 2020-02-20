package br.com.thegabrielfalcao.designpatterns.chainofresponsability.anothergabrielfalcao;

import br.com.thegabrielfalcao.designpatterns.chainofresponsability.anothergabrielfalcao.handlers.ResponsabilityChain;
import br.com.thegabrielfalcao.designpatterns.chainofresponsability.anothergabrielfalcao.handlers.impl.BusinessHandler;
import br.com.thegabrielfalcao.designpatterns.chainofresponsability.anothergabrielfalcao.handlers.impl.HumanResourcesHandler;
import br.com.thegabrielfalcao.designpatterns.chainofresponsability.anothergabrielfalcao.handlers.impl.ItHandler;
import br.com.thegabrielfalcao.designpatterns.chainofresponsability.anothergabrielfalcao.model.impl.It;
import br.com.thegabrielfalcao.designpatterns.chainofresponsability.anothergabrielfalcao.model.impl.Reclamation;

public class Main {

    public static void main(String[] args) {

        Reclamation reclamation = new Reclamation(new It());

        ResponsabilityChain chain = new ItHandler();
        chain.linkWith(new HumanResourcesHandler()).linkWith(new BusinessHandler());

        chain.resolve(reclamation);
    }
}