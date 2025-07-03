package edu.miu.shipment;

public sealed interface Shipment permits StandardShipment, ExpressShipment, OvernightShipment {
    String getTrackingDetails();
}