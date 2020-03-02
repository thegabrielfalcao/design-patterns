package br.com.thegabrielfalcao.designpatterns.strategy.gabrielfalcao.context;

import br.com.thegabrielfalcao.designpatterns.strategy.gabrielfalcao.context.strategies.OperacaoMatematica;

/**
 * A classe Calculadora no caso é o contexto
 */
public class Calculadora {

    public double calcular(OperacaoMatematica operacao, double primeiroNumero, double segundoNumero) {
        return operacao.calcular(primeiroNumero, segundoNumero);
    }
}
