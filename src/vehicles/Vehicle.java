package vehicles;

import java.text.DecimalFormat;

public abstract class Vehicle {
    private double fuelQuantity;
    private boolean airConditionIsOn;
    private double fuelConsumption;
    private double additionalConsumption;

    protected Vehicle(double fuelQuantity, double fuelConsumption
            , double additionalConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.setAirConditionIsOn();
        this.additionalConsumption = additionalConsumption;
        this.setFuelConsumption(fuelConsumption);
    }

    protected void setFuelConsumption(double fuelConsumption) {
        if (airConditionIsOn) {
            this.fuelConsumption = fuelConsumption + additionalConsumption;
        } else {
            this.fuelConsumption = fuelConsumption;
        }
    }

    private void setAirConditionIsOn() {
        this.airConditionIsOn = true;
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
        this.fuelQuantity += fuel;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f",
                this.getClass().getSimpleName(),
                this.getFuelQuantity());
    }
}
