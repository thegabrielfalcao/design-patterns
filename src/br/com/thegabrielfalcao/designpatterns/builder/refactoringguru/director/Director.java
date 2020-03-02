package br.com.thegabrielfalcao.designpatterns.builder.refactoringguru.director;

import br.com.thegabrielfalcao.designpatterns.builder.refactoringguru.builders.Builder;
import br.com.thegabrielfalcao.designpatterns.builder.refactoringguru.cars.Type;
import br.com.thegabrielfalcao.designpatterns.builder.refactoringguru.components.Engine;
import br.com.thegabrielfalcao.designpatterns.builder.refactoringguru.components.GPSNavigator;
import br.com.thegabrielfalcao.designpatterns.builder.refactoringguru.components.Transmission;
import br.com.thegabrielfalcao.designpatterns.builder.refactoringguru.components.TripComputer;

public class Director {
    public void constructSportsCar(Builder builder) {
        builder.setType(Type.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setType(Type.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setType(Type.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}
