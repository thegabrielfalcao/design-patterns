package br.com.thegabrielfalcao.designpatterns.chainofresponsability.alura.calculadora.desconto.impl;

import br.com.thegabrielfalcao.designpatterns.chainofresponsability.alura.calculadora.model.Orcamento;
import br.com.thegabrielfalcao.designpatterns.chainofresponsability.alura.calculadora.desconto.Desconto;

public class SemDesconto implements Desconto {

    @Override
    public void proximoDesconto(Desconto desconto) {
    }

    @Override
    public double calcular(Orcamento orcamento) {
        return 0;
    }
}
