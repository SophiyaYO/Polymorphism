package vehiclesExtension;

public class Bus extends Vehicle {

    protected Bus(double fuelQuantity, double fuelConsumption, double additionalConsumption, double tankCapacity, String drive) {
        super(fuelQuantity, fuelConsumption, additionalConsumption, tankCapacity, drive);
    }

    @Override
    protected void setFuelConsumption(double fuelConsumption) {
        if (airConditionIsOn) {
            super.fuelConsumption = fuelConsumption + 1.4;
        } else {
            this.fuelConsumption = fuelConsumption;
        }
    }
}
