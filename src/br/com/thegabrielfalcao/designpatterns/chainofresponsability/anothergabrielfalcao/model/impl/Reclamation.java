package br.com.thegabrielfalcao.designpatterns.chainofresponsability.anothergabrielfalcao.model.impl;

import br.com.thegabrielfalcao.designpatterns.chainofresponsability.anothergabrielfalcao.model.Sector;

public class Reclamation {

    private Sector responsable;

    public Reclamation(Sector responsable) {
        this.responsable = responsable;
    }

    public Sector getResponsable() {
        return responsable;
    }

}
