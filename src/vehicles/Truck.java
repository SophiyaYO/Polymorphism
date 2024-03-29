package vehicles;

public class Truck extends Vehicle {
    private static final double ADDITIONAL_CONSUMPTION = 1.6;

    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption, ADDITIONAL_CONSUMPTION);
    }


    @Override
    public void refueledLiters(double fuel) {
        super.refueledLiters(fuel * 0.95);
    }

}
