package vehicles;

public class Car extends Vehicle {
    private double fuelQuantity;
    private double litersPerKm;

    public Car(double fuelQuantity, double litersPerKm) {
        this.setFuelQuantity(fuelQuantity);
        this.setFuelConsumption(litersPerKm);
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
    protected double drivenDistance() {


    }

    @Override
    protected double refueledLiters() {

    }
}
