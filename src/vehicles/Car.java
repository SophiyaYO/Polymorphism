package vehicles;

public class Car extends Vehicle {
    private static final double ADDITIONAL_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double litersPerKm) {
       super(fuelQuantity, litersPerKm, ADDITIONAL_CONSUMPTION);
    }



}
