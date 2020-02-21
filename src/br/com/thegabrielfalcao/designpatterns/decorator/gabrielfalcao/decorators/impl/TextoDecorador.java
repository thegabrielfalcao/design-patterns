package br.com.thegabrielfalcao.designpatterns.decorator.gabrielfalcao.decorators.impl;

import br.com.thegabrielfalcao.designpatterns.decorator.gabrielfalcao.decorators.Campo;

public abstract class TextoDecorador implements Campo {

    private Campo campo;

    public TextoDecorador(Campo campo) {
        this.campo = campo;
    }

    @Override
    public String getTexto(String texto) {
        return campo.getTexto(texto);
    }
}
