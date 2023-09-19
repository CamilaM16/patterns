package builder.shipment.entity;

import builder.shipment.utils.Status;

public class Location {
    private final Status status;
    private final String origin;
    private final String destination;

    public Location(Status status, String origin, String destination) {
        this.status = status;
        this.origin = origin;
        this.destination = destination;
    }

    public Status getStatus() {
        return status;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }
}
