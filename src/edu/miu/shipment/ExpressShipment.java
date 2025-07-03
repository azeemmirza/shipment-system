package edu.miu.shipment;

public final class ExpressShipment implements Shipment {
    private final String trackingNumber;
    private final String priorityLevel;

    public ExpressShipment(String trackingNumber, String priorityLevel) {
        this.trackingNumber = trackingNumber;
        this.priorityLevel = priorityLevel;
    }

    @Override
    public String getTrackingDetails() {
        return "Express - Tracking: " + trackingNumber + ", Priority: " + priorityLevel;
    }
}