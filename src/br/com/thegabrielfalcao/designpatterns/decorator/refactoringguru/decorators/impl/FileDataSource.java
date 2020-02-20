package br.com.thegabrielfalcao.designpatterns.decorator.refactoringguru.decorators.impl;

import br.com.thegabrielfalcao.designpatterns.decorator.refactoringguru.decorators.DataSource;

import java.io.*;

/**
 * Componente concreto que terá apenas como função escrever e ler arquivos do disco.
 * Ele define o comportamento básico, que poderá ser alterado pelos decorators, e implementa a mesma interface que os
 * demais decorators.
 */
public class FileDataSource implements DataSource {

    private String name;

    public FileDataSource(String name) {
        this.name = name;
    }

    @Override
    public void writeData(String data) {
        File file = new File(name);
        try (OutputStream fos = new FileOutputStream(file)) {
            fos.write(data.getBytes(), 0, data.length());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(name);
        try (FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return new String(buffer);
    }
}
