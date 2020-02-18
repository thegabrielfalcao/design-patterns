package br.com.thegabrielfalcao.designpatterns.templatemethod.gabrielfalcao.seguro;

import br.com.thegabrielfalcao.designpatterns.templatemethod.gabrielfalcao.model.Segurado;

public abstract class CalculadoraSeguro {

    protected Segurado segurado;
    protected final double VALOR_DEFAULT_SEGURO = 10000;

    public double calcular() {

        if(isApto()) {

            System.out.println("Cliente apto para ser assegurado");

            double pesoIdade = verificarFaixaEtaria();
            System.out.println("Faixa etária verificada, atribuido peso [" + pesoIdade + "]");

            double pesoTamanhoNome = verificarTamanhoNome();
            System.out.println("Tamanho do nome verificado, atribuido peso [" + pesoTamanhoNome + "]");

            return VALOR_DEFAULT_SEGURO * pesoIdade * pesoTamanhoNome;
        }

        throw new RuntimeException("Segurado não é apto para tal seguro");
    }

    protected abstract double verificarTamanhoNome();

    protected abstract double verificarFaixaEtaria();

    protected abstract boolean isApto();
}
