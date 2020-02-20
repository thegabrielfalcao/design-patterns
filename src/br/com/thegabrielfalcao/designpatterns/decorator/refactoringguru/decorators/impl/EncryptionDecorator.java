package br.com.thegabrielfalcao.designpatterns.decorator.refactoringguru.decorators.impl;

import br.com.thegabrielfalcao.designpatterns.decorator.refactoringguru.decorators.DataSource;

import java.util.Base64;

/**
 * Decorador concreto que irá herdar do DataSourceDecorator (e indiretamente irá implementar o DataSource).
 * Essa classe será a responsável por ter um comportamento extra que irá mudar dinamicamente.
 *
 * No caso especifico da EncryptionDecorator, ele irá encriptar os dados e chamar o método writeData() do pai,
 * que por sua vez irá chamar o writeData() do próximo objeto que foi embrulhado.
 *
 * No exemplo no client, esse é o último decorador antes de chamar o writeData() do componente concreto (FileDataSource),
 * que é o cara responsável por ter o comportamento default!
 */
public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource wrappee) {
        super(wrappee);
    }

    @Override
    public void writeData(String data) {
        super.writeData(encode(data));
    }

    @Override
    public String readData() {
        return decode(super.readData());
    }

    private String encode(String data) {
        byte[] result = data.getBytes();
        for (int i = 0; i < result.length; i++) {
            result[i] += (byte) 1;
        }

        return Base64.getEncoder().encodeToString(result);
    }

    private String decode(String data) {
        byte[] result = Base64.getDecoder().decode(data);
        for (int i = 0; i < result.length; i++) {
            result[i] -= (byte) 1;
        }

        return new String(result);
    }
}
