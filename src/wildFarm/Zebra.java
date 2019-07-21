package wildFarm;

public class Zebra extends Mammal {
    public Zebra(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    protected void makeSound() {
        System.out.println("Zs");

    }

    @Override
    protected void eat(Food food) {

    }
}
