package wildFarm;

import java.text.DecimalFormat;

public class Cat extends Felime {
    private String breed;


    public Cat(String animalName, String animalType,
               Double animalWeight, Integer foodEaten,
               String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
        this.breed = breed;
    }

    public String getBreed() {
        return this.breed;
    }

    @Override
    protected void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");

        return String.format("%s[%s, %s, %s, %s, %d]",
                super.getClass().getSimpleName(),
                this.getBreed(),
                super.getAnimalName(),
                df.format(super.getAnimalWeight()),
                this.getLivingRegion(),
                super.getFoodEaten()).trim();
    }
}
