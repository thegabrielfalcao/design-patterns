package br.com.thegabrielfalcao.designpatterns.decorator.refactoringguru.decorators.impl;

import br.com.thegabrielfalcao.designpatterns.decorator.refactoringguru.decorators.DataSource;

/**
 * Decorator base para as implementações, ele deverá conter como atributo um novo decorator, porém chamado pela interface
 * a fim de receber tanto os decorators concretos quanto o componente concreto (que será o último a ser chamado).
 *
 * Esse decorador base delega TODAS as operações para o objeto embrulhaddo (wrappee).
 */
public abstract class DataSourceDecorator implements DataSource {

    private DataSource wrappee;

    public DataSourceDecorator(DataSource wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void writeData(String data) {
        this.wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}