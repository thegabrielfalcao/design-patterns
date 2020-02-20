package br.com.thegabrielfalcao.designpatterns.chainofresponsability.alura;

import br.com.thegabrielfalcao.designpatterns.chainofresponsability.alura.calculadora.CalculadoraDeDescontos;
import br.com.thegabrielfalcao.designpatterns.chainofresponsability.alura.calculadora.model.Item;
import br.com.thegabrielfalcao.designpatterns.chainofresponsability.alura.calculadora.model.Orcamento;

public class Main {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new Item("Caneta", 100));
        orcamento.adicionarItem(new Item("Lapis", 100));
        orcamento.adicionarItem(new Item("Lapiseira", 100));
        orcamento.adicionarItem(new Item("Borracha", 100));
        orcamento.adicionarItem(new Item("Cadeira", 100.1));

        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();

        double desconto = calculadoraDeDescontos.calcular(orcamento);

        System.out.println(desconto);
    }
}
