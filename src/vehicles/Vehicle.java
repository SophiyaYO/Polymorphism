package vehicles;

public abstract class Vehicle {
    private double fuelQuantity;
    private double litersPerKm;


    public double getFuelQuantity() {
        return this.fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getLitersPerKm() {
        return this.litersPerKm;
    }

    public void setLitersPerKm(double litersPerKm) {
        this.litersPerKm = litersPerKm;
    }

    protected abstract void drivenDistance();

    protected abstract void refueledLiters();
}
