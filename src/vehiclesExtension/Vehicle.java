package vehiclesExtension;

import java.text.DecimalFormat;

public abstract class Vehicle {
    private double fuelQuantity;
    public boolean airConditionIsOn;
    protected double fuelConsumption;
    private double additionalConsumption;
    private double tankCapacity;

    protected Vehicle(double fuelQuantity, double fuelConsumption
            , double additionalConsumption, double tankCapacity, String drive) {

        this.setFuelQuantity(fuelQuantity);
        this.setAirConditionIsOn(drive);
        this.additionalConsumption = additionalConsumption;
        this.setFuelConsumption(fuelConsumption);
        this.tankCapacity = tankCapacity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        if (fuelQuantity >= 0) {
            this.fuelQuantity = fuelQuantity;
        } else {
            System.out.println(("Fuel must be a positive number"));
        }
    }

    protected void setFuelConsumption(double fuelConsumption) {
        if (airConditionIsOn) {
            this.fuelConsumption = fuelConsumption + additionalConsumption;
        } else {
            this.fuelConsumption = fuelConsumption;
        }
    }

    protected void setAirConditionIsOn(String drive) {
        if (drive.equalsIgnoreCase("drive")) {
            this.airConditionIsOn = true;
        } else {
            this.airConditionIsOn = false;

        }
    }

    public double getFuelQuantity() {
        return this.fuelQuantity;
    }

    public String drivenDistance(double distance) {
        String output;

        double fuelNeeded = distance * this.fuelConsumption;

        if (fuelNeeded <= this.fuelQuantity) {
            this.fuelQuantity -= fuelNeeded;

            DecimalFormat pattern = new DecimalFormat("#.##");

            output =
                    String.format("%s travelled %s km",
                            this.getClass().getSimpleName(),
                            pattern.format(distance));
        } else {
            output = String.format("%s needs refueling",
                    this.getClass().getSimpleName());
        }

        return output;
    }

    public void refueledLiters(double fuel) {
        if (this.fuelQuantity + fuel <= this.tankCapacity) {
            this.fuelQuantity += fuel;
        } else {
            System.out.println(("Cannot fit fuel in tank"));
        }

    }

    @Override
    public String toString() {
        return String.format("%s: %.2f",
                this.getClass().getSimpleName(),
                this.getFuelQuantity());
    }
}
