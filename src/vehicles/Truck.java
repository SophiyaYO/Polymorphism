package vehicles;

public class Truck extends Vehicle {
    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
    }

    @Override
    protected double refueledLiters() {
        return 0;
    }

    @Override
    public String drivenDistance(double distance) {
        return super.drivenDistance(distance);
    }
}
