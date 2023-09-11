package builder.shipment.builder;

import builder.shipment.entity.Location;
import builder.shipment.utils.Status;

public class LocationBuilder {
    private Status status;
    private String origin;
    private String destination;

    public LocationBuilder status(Status status) {
        this.status = status;
        return this;
    }

    public LocationBuilder origin(String origin) {
        this.origin = origin;
        return this;
    }

    public LocationBuilder destination(String destination) {
        this.destination = destination;
        return this;
    }

    public Location build() {
        return new Location(status, origin, destination);
    }
}
