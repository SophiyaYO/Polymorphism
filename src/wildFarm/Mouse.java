package wildFarm;

public class Mouse extends Mammal {
    public Mouse(String animalName, String animalType,
                 Double animalWeight, Integer foodEaten,
                 String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    protected void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    protected void eat(Food food) {
        if (food.getClass().getSimpleName().equalsIgnoreCase("Meat")) {
            System.out.println("Mouses are not eating that type of food!");
            super.setFoodEaten(0);
        } else {
            super.setFoodEaten(food.getQuantity());
        }
    }
}
