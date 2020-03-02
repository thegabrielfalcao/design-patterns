package br.com.thegabrielfalcao.designpatterns.strategy.anothergabrielfalcao.strategies.impl;

import br.com.thegabrielfalcao.designpatterns.strategy.anothergabrielfalcao.strategies.MensagemDoDia;

public class Domingo implements MensagemDoDia {
    @Override
    public String escreverMensagemDoDia() {
        return "Hoje é domingo!";
    }
}