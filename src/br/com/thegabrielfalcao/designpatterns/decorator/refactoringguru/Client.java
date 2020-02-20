package br.com.thegabrielfalcao.designpatterns.decorator.refactoringguru;

import br.com.thegabrielfalcao.designpatterns.decorator.refactoringguru.decorators.DataSource;
import br.com.thegabrielfalcao.designpatterns.decorator.refactoringguru.decorators.impl.CompressionDecorator;
import br.com.thegabrielfalcao.designpatterns.decorator.refactoringguru.decorators.impl.DataSourceDecorator;
import br.com.thegabrielfalcao.designpatterns.decorator.refactoringguru.decorators.impl.EncryptionDecorator;
import br.com.thegabrielfalcao.designpatterns.decorator.refactoringguru.decorators.impl.FileDataSource;

public class Client {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("out/OutputDemo.txt")));

        encoded.writeData(salaryRecords);

        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
