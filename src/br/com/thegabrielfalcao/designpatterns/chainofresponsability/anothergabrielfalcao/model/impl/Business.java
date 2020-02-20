package br.com.thegabrielfalcao.designpatterns.chainofresponsability.anothergabrielfalcao.model.impl;

import br.com.thegabrielfalcao.designpatterns.chainofresponsability.anothergabrielfalcao.model.Sector;

public class Business extends Sector {

    @Override
    public void treatReclamation(Reclamation reclamation) {
        System.out.println("Business problem! Treating reclamation.");
    }
}
