package br.com.thegabrielfalcao.designpatterns.decorator.refactoringguru.decorators;

/**
 * Componente que será alterado pelos decorators. Será também implementado pelo componente concreto
 */
public interface DataSource {
    public void writeData(String data);
    public String readData();
}
