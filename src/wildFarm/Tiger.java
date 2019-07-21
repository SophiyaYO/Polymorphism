package wildFarm;

public class Tiger extends Felime {

    public Tiger(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    protected void eat(Food food) {
        if (food.getClass().getSimpleName().equalsIgnoreCase("Vegetable")) {
            System.out.println("Tigers are not eating that type of food!");
            super.setFoodEaten(0);
        } else {
            super.eat(food);
        }
    }

    @Override
    protected void makeSound() {
        System.out.println("ROAAR!!!");
    }
}
