package br.com.thegabrielfalcao.designpatterns.decorator.gabrielfalcao.decorators.impl;

import br.com.thegabrielfalcao.designpatterns.decorator.gabrielfalcao.decorators.Campo;

public class CaixaAltaDecorador extends TextoDecorador {

    public CaixaAltaDecorador(Campo campo) {
        super(campo);
    }

    @Override
    public String getTexto(String texto) {
        return super.getTexto(setTextoCaixaAlta(texto));
    }

    public String setTextoCaixaAlta(String texto) {
        return texto.toUpperCase();
    }
}
