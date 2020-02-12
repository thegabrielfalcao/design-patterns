package br.com.thegabrielfalcao.designpatterns.strategy.context.strategies;

/**
 * Interface que abstrai o que toda operacao matemática faz, que é calcular, onde seus filhos terão as implementações
 */
public interface OperacaoMatematica {
    double calcular(double primeiroNumero, double segundoNumero);
}
