package wildFarm;

public abstract class Felime extends Mammal {
    public Felime(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    protected void makeSound() {

    }

    @Override
    protected void eat(Food food) {

    }
}
