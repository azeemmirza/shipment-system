package edu.miu.shipment;

public class ShipmentTracker {
    public static void track(Shipment shipment) {
        if (!(shipment instanceof StandardShipment || shipment instanceof ExpressShipment || shipment instanceof OvernightShipment)) {
            throw new IllegalArgumentException("Unsupported shipment type.");
        }
        System.out.println(shipment.getTrackingDetails());
    }

    public static void main(String[] args) {
        Shipment s1 = new StandardShipment("ST123", "2025-07-10");
        Shipment s2 = new ExpressShipment("EX456", "High");
        Shipment s3 = new OvernightShipment("ON789", "Tomorrow 9AM");

        track(s1);
        track(s2);
        track(s3);
    }
}