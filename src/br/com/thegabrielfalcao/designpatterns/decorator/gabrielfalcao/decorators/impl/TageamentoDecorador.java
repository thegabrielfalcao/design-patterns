package br.com.thegabrielfalcao.designpatterns.decorator.gabrielfalcao.decorators.impl;

import br.com.thegabrielfalcao.designpatterns.decorator.gabrielfalcao.decorators.Campo;

public class TageamentoDecorador extends TextoDecorador {

    public TageamentoDecorador(Campo campo) {
        super(campo);
    }

    @Override
    public String getTexto(String texto) {
        return super.getTexto(setTextoTageado(texto));
    }

    public String setTextoTageado(String texto) {
        return "<b>" + texto + "</b>";
    }
}
