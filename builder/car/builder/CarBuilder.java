package builder.car.builder;

import builder.car.entity.Car;
import builder.car.utils.EnergyType;
import builder.car.utils.Precedence;

public class CarBuilder {
    private int id;
    private EnergyType energyType;
    private int model;
    private double price;
    private Precedence precedence;

    public CarBuilder id(int id) {
        this.id = id;
        return this;
    }

    public CarBuilder energyType(EnergyType energyType) {
        this.energyType = energyType;
        return this;
    }

    public CarBuilder model(int model) {
        this.model = model;
        return this;
    }

    public CarBuilder price(double price) {
        this.price = price;
        return this;
    }

    public CarBuilder precedence(Precedence precedence) {
        this.precedence = precedence;
        return this;
    }

    public CarBuilder toBuilder() {
        return Car.builder()
                .id(id)
                .energyType(energyType)
                .model(model)
                .precedence(precedence)
                .price(price);
    }

    public Car build() {
        return new Car(
                id,
                energyType,
                model,
                price,
                precedence);
    }
}
