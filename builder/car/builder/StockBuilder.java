package builder.car.builder;

import builder.car.entity.Car;
import builder.car.entity.Stock;

public class StockBuilder {
    private Car carType;
    private int quality;

    public StockBuilder carType(Car carType) {
        this.carType = carType;
        return this;
    }

    public StockBuilder quality(int quality) {
        this.quality = quality;
        return this;
    }

    public Stock build() {
        return new Stock(carType, quality);
    }
}
