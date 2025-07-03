package edu.miu.shipment;

public final class OvernightShipment implements Shipment {
    private final String trackingNumber;
    private final String deliveryTime;

    public OvernightShipment(String trackingNumber, String deliveryTime) {
        this.trackingNumber = trackingNumber;
        this.deliveryTime = deliveryTime;
    }

    @Override
    public String getTrackingDetails() {
        return "Overnight - Tracking: " + trackingNumber + ", Delivery Time: " + deliveryTime;
    }
}