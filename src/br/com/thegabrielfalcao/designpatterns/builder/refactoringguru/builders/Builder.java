package br.com.thegabrielfalcao.designpatterns.builder.refactoringguru.builders;

import br.com.thegabrielfalcao.designpatterns.builder.refactoringguru.cars.Type;
import br.com.thegabrielfalcao.designpatterns.builder.refactoringguru.components.Engine;
import br.com.thegabrielfalcao.designpatterns.builder.refactoringguru.components.GPSNavigator;
import br.com.thegabrielfalcao.designpatterns.builder.refactoringguru.components.Transmission;
import br.com.thegabrielfalcao.designpatterns.builder.refactoringguru.components.TripComputer;

public interface Builder {
    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}