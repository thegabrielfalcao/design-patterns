package br.com.thegabrielfalcao.designpatterns.strategy.context.strategies.impl;

import br.com.thegabrielfalcao.designpatterns.strategy.context.strategies.OperacaoMatematica;

public class Multiplicacao implements OperacaoMatematica {

    @Override
    public double calcular(double primeiroNumero, double segundoNumero) {
        return primeiroNumero * segundoNumero;
    }
}
