package builder.car.entity;

import builder.car.builder.CarBuilder;
import builder.car.utils.EnergyType;
import builder.car.utils.Precedence;

public class Car {
    private final int id;
    private final EnergyType energyType;
    private final int model;
    private final double price;
    private final Precedence precedence;

    public Car(int id, EnergyType energyType, int model, double price, Precedence precedence) {
        this.id = id;
        this.energyType = energyType;
        this.model = model;
        this.price = price;
        this.precedence = precedence;
    }

    public static CarBuilder builder() {
        return new CarBuilder();
    }
}
