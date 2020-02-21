package br.com.thegabrielfalcao.designpatterns.decorator.gabrielfalcao.decorators.impl;

import br.com.thegabrielfalcao.designpatterns.decorator.gabrielfalcao.decorators.Campo;

public class TextoComponente implements Campo {

    @Override
    public String getTexto(String texto) {
        return texto;
    }
}
