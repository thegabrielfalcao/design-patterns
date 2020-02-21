package br.com.thegabrielfalcao.designpatterns.decorator.gabrielfalcao.decorators.impl;

import br.com.thegabrielfalcao.designpatterns.decorator.gabrielfalcao.decorators.Campo;

public class InvertidoDecorador extends TextoDecorador {

    public InvertidoDecorador(Campo campo) {
        super(campo);
    }

    @Override
    public String getTexto(String texto) {
        return super.getTexto(setTextoInvertido(texto));
    }

    public String setTextoInvertido(String texto) {
        String textoInvertido = "";

        for (int cont = texto.length()-1; cont >= 0; cont--) {
            textoInvertido += texto.toCharArray()[cont];
        }

        return textoInvertido;
    }
}
