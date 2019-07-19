package vehicles;

public class Car extends Vehicle {
    private double fuelQuantity;
    private double litersPerKm;

    public Car(double fuelQuantity, double litersPerKm) {
        this.fuelQuantity = fuelQuantity;
        this.litersPerKm = litersPerKm;
    }


    @Override
    protected void drivenDistance() {

    }

    @Override
    protected void refueledLiters() {

    }
}
