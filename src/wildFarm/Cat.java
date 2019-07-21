package wildFarm;

public class Cat extends Felime {
    private String breed;


    public Cat(String animalName, String animalType,
               Double animalWeight, Integer foodEaten,
               String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
        this.breed = breed;
    }

    @Override
    protected void makeSound() {
        System.out.println("Meowwww");
    }
}
