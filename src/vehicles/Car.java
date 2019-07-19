package vehicles;

public class Car extends Vehicle {
    private double fuelQuantity;
    private double litersPerKm;

    public Car(double fuelQuantity, double litersPerKm) {
       super(fuelQuantity, litersPerKm);
    }

    @Override
    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    @Override
    public void setFuelConsumption(double fuelConsumption) {
        this.litersPerKm = fuelConsumption + 0.9;
    }


    @Override
    public String drivenDistance(double distance) {
        return super.drivenDistance(distance);
    }

    @Override
    protected double refueledLiters() {
        return 0;
    }
}
