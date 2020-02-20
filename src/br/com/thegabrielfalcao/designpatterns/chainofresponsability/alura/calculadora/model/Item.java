package br.com.thegabrielfalcao.designpatterns.chainofresponsability.alura.calculadora.model;

public class Item {

    private String nome;
    private double valor;

    public Item(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return this.nome;
    }

    public double getValor() {
        return this.valor;
    }
}
