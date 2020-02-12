package br.com.thegabrielfalcao.designpatterns.strategy;

import br.com.thegabrielfalcao.designpatterns.strategy.context.Calculadora;
import br.com.thegabrielfalcao.designpatterns.strategy.context.strategies.impl.Adicao;
import br.com.thegabrielfalcao.designpatterns.strategy.context.strategies.impl.Divisao;
import br.com.thegabrielfalcao.designpatterns.strategy.context.strategies.impl.Multiplicacao;
import br.com.thegabrielfalcao.designpatterns.strategy.context.strategies.impl.Subtracao;

public class Main {

    public static void main(String[] args) {

        Adicao adicao = new Adicao();
        Subtracao subtracao = new Subtracao();
        Multiplicacao mult = new Multiplicacao();
        Divisao divisao = new Divisao();

        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.calcular(adicao, 2, 2));
        System.out.println(calculadora.calcular(subtracao, 2, 2));
        System.out.println(calculadora.calcular(mult, 2, 2));
        System.out.println(calculadora.calcular(divisao, 2, 2));
    }
}
