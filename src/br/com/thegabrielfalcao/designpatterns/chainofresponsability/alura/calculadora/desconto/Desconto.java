package br.com.thegabrielfalcao.designpatterns.chainofresponsability.alura.calculadora.desconto;

import br.com.thegabrielfalcao.designpatterns.chainofresponsability.alura.calculadora.model.Orcamento;

public interface Desconto {

    void proximoDesconto(Desconto desconto);
    double calcular(Orcamento orcamento);
}