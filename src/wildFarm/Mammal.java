package wildFarm;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    private String livingRegion;

    public Mammal(String animalName, String animalType,
                  Double animalWeight, Integer foodEaten,
                  String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten);
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return this.livingRegion;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");

        return String.format("%s[%s, %s, %s, %d]",
                super.getClass().getSimpleName(),
                super.getAnimalName(),
                df.format(super.getAnimalWeight()),
                this.getLivingRegion(),
                super.getFoodEaten()).trim();
    }
}
