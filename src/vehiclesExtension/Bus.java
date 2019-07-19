package vehiclesExtension;

public class Bus extends Vehicle {
    private static final double ADDITIONAL_CONSUMPTION = 1.4;

    public Bus(double fuelQuantity, double litersPerKm, double tankCapacity) {
        super(fuelQuantity, litersPerKm, ADDITIONAL_CONSUMPTION, tankCapacity);
    }
}
