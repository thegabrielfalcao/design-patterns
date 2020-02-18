package br.com.thegabrielfalcao.designpatterns.templatemethod.gabrielfalcao.seguro.impl;

import br.com.thegabrielfalcao.designpatterns.templatemethod.gabrielfalcao.model.Segurado;
import br.com.thegabrielfalcao.designpatterns.templatemethod.gabrielfalcao.seguro.CalculadoraSeguro;

import java.util.Random;

public class CalculadoraSeguroAuto extends CalculadoraSeguro {

    public CalculadoraSeguroAuto(Segurado segurado) {
        this.segurado = segurado;
    }

    @Override
    protected double verificarTamanhoNome() {
        System.out.println("Calculando peso do tamanho nome para o seguro de automóveis");
        return this.segurado.getNome().length() > 5 ? 1.2 : 1.5;
    }

    @Override
    protected double verificarFaixaEtaria() {
        System.out.println("Calculando peso da idade para o seguro de automóveis");
        return (this.segurado.getIdade() > 25 && this.segurado.getIdade() < 40) ? 2 : 1.5;
    }

    @Override
    protected boolean isApto() {
        return new Random().nextBoolean();
    }
}
