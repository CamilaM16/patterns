package builder.car.entity;

import builder.car.builder.StockBuilder;

public class Stock {
    private final Car carType;
    private final int quatity;

    public Stock(Car carType, int quatity) {
        this.carType = carType;
        this.quatity = quatity;
    }

    public StockBuilder builder() {
        return new StockBuilder();
    }
}
