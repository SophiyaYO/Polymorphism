package vehiclesExtension;

public class Bus extends Vehicle {
    private static final double ADDITIONAL_CONSUMPTION = 0;

    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, ADDITIONAL_CONSUMPTION, tankCapacity);
    }
}
