package vehiclesExtension;

import java.text.DecimalFormat;

public class Bus extends Vehicle {
    private static final double ADDITIONAL_CONSUMPTION = 0;

    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, ADDITIONAL_CONSUMPTION, tankCapacity);
    }

    @Override
    public String drivenDistance(double distance) {
        String output;

        double fuelNeeded = distance * (super.getFuelConsumption() + 1.4);

        if (fuelNeeded <= super.getFuelQuantity()) {
            super.setFuelQuantity(super.getFuelQuantity()- fuelNeeded);

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

    @Override
    public String drivenDistanceEmpty(double distance) {
        String output;

        double fuelNeeded = distance * super.getFuelConsumption();

        if (fuelNeeded <= super.getFuelQuantity()) {
            super.setFuelQuantity(super.getFuelQuantity()- fuelNeeded);

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
}
