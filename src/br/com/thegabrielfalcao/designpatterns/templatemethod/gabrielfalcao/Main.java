package br.com.thegabrielfalcao.designpatterns.templatemethod.gabrielfalcao;

import br.com.thegabrielfalcao.designpatterns.templatemethod.gabrielfalcao.model.Segurado;
import br.com.thegabrielfalcao.designpatterns.templatemethod.gabrielfalcao.seguro.CalculadoraSeguro;
import br.com.thegabrielfalcao.designpatterns.templatemethod.gabrielfalcao.seguro.impl.CalculadoraSeguroAuto;
import br.com.thegabrielfalcao.designpatterns.templatemethod.gabrielfalcao.seguro.impl.CalculadoraSeguroSaude;

public class Main {

    public static void main(String[] args) {
        Segurado segurado = new Segurado("José", 35);
        Segurado segurada = new Segurado("Ana Beatriz Cardoso", 20);

        CalculadoraSeguro calculadoraJose = new CalculadoraSeguroAuto(segurado);
        CalculadoraSeguro calculadoraAna = new CalculadoraSeguroAuto(segurada);

        CalculadoraSeguro calculadoraJoseSaude = new CalculadoraSeguroSaude(segurado);
        CalculadoraSeguro calculadoraAnaSaude = new CalculadoraSeguroSaude(segurada);

        System.out.println("Valor do Seguro para o José R$" + calculadoraJoseSaude.calcular());
        System.out.println("Valor do Seguro para a Ana R$" + calculadoraAnaSaude.calcular());

    }
}
