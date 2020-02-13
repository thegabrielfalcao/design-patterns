package br.com.thegabrielfalcao.designpatterns.chainofresponsability.alura.calculadora.model;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {

    private double valorFinal;
    private List<Item> itens = new ArrayList<>();

    public void adicionarItem(Item item) {
        itens.add(item);
        valorFinal += item.getValor();
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public List<Item> getItens() {
        return itens;
    }
}
