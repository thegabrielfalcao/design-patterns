package br.com.thegabrielfalcao.designpatterns.chainofresponsability.anothergabrielfalcao.model;

import br.com.thegabrielfalcao.designpatterns.chainofresponsability.anothergabrielfalcao.model.impl.Reclamation;

public abstract class Sector {

    public abstract void treatReclamation(Reclamation reclamation);
}
