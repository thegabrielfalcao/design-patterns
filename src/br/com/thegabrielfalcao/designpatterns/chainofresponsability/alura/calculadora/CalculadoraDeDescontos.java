package br.com.thegabrielfalcao.designpatterns.chainofresponsability.alura.calculadora;

import br.com.thegabrielfalcao.designpatterns.chainofresponsability.alura.calculadora.desconto.Desconto;
import br.com.thegabrielfalcao.designpatterns.chainofresponsability.alura.calculadora.desconto.impl.DescontoPorCincoItens;
import br.com.thegabrielfalcao.designpatterns.chainofresponsability.alura.calculadora.desconto.impl.DescontoValorMaiorQuinhentosReais;
import br.com.thegabrielfalcao.designpatterns.chainofresponsability.alura.calculadora.desconto.impl.SemDesconto;
import br.com.thegabrielfalcao.designpatterns.chainofresponsability.alura.calculadora.model.Orcamento;

public class CalculadoraDeDescontos {

    public double calcular(Orcamento orcamento) {
        Desconto d1 = new DescontoPorCincoItens();
        Desconto d2 = new DescontoValorMaiorQuinhentosReais();
        Desconto d3 = new SemDesconto();

        d1.proximoDesconto(d2);
        d2.proximoDesconto(d3);

        return d1.calcular(orcamento);
    }
}
