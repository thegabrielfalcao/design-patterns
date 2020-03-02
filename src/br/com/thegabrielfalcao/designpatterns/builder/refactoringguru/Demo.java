package br.com.thegabrielfalcao.designpatterns.builder.refactoringguru;

import br.com.thegabrielfalcao.designpatterns.builder.refactoringguru.director.Director;
import br.com.thegabrielfalcao.designpatterns.builder.refactoringguru.builders.CarBuilder;
import br.com.thegabrielfalcao.designpatterns.builder.refactoringguru.builders.CarManualBuilder;
import br.com.thegabrielfalcao.designpatterns.builder.refactoringguru.cars.Car;
import br.com.thegabrielfalcao.designpatterns.builder.refactoringguru.cars.Manual;

public class Demo {
    public static void main(String[] args) {

        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
