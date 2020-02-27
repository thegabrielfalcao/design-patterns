package br.com.thegabrielfalcao.designpatterns.strategy.gabrielfalcao.context.strategies.impl;

import br.com.thegabrielfalcao.designpatterns.strategy.gabrielfalcao.context.strategies.OperacaoMatematica;

public class Subtracao implements OperacaoMatematica {
    @Override
    public double calcular(double primeiroNumero, double segundoNumero) {
        return primeiroNumero - segundoNumero;
    }
}
