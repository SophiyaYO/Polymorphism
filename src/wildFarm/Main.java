package wildFarm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        List<Animal> animalList = new ArrayList<>();
        List<Food> foodList = new ArrayList<>();

        String input;
        while (!"end".equalsIgnoreCase(input = reader.readLine())) {
            String[] animalTokens = input.split("\\s+");
            String[] foodTokens = reader.readLine().split("\\s+");

            if (foodTokens[0].equalsIgnoreCase("Vegetable")) {
                Food vegetable = new Vegetable(Integer.parseInt(foodTokens[1]));
                foodList.add(vegetable);

            } else {
                Food meat = new Meat(Integer.parseInt(foodTokens[1]));
                foodList.add(meat);
            }

            switch (animalTokens[0]) {
                case "Mouse":
                    animalList.add(produceAnimal(animalTokens, foodList));
                    foodList.remove(0);

                    break;

                case "Zebra":
                    animalList.add(produceAnimal(animalTokens, foodList));
                    foodList.remove(0);
                    break;

                case "Cat":
                    animalList.add(produceAnimal(animalTokens, foodList));
                    foodList.remove(0);
                    break;

                case "Tiger":
                    animalList.add(produceAnimal(animalTokens, foodList));
                    foodList.remove(0);

                    break;
            }
        }

        for (Animal animal : animalList) {
            toStringPrint(animal);
        }
    }

    private static Animal produceAnimal(String[] tokens, List<Food> food) {
        Integer foodQuantity = food.get(0).getQuantity();

        List<Animal> animals = new ArrayList<>();

        switch (tokens[0]) {
            case "Mouse":
                Animal mouse = new Mouse(
                        tokens[1],
                        tokens[0],
                        Double.parseDouble(tokens[2]),
                        foodQuantity,
                        tokens[3]
                );

                printSound(mouse);
                mouse.eat(food.get(0));

                toStringPrint(mouse);
                animals.add(mouse);

                break;

            case "Zebra":
                Animal zebra = new Zebra(
                        tokens[1],
                        tokens[0],
                        Double.parseDouble(tokens[2]),
                        foodQuantity,
                        tokens[3]
                );
                printSound(zebra);
                zebra.eat(food.get(0));

                animals.add(zebra);

                break;

            case "Cat":
                Animal cat = new Cat(
                        tokens[1],
                        tokens[0],
                        Double.parseDouble(tokens[2]),
                        foodQuantity,
                        tokens[3],
                        tokens[4]
                );

                printSound(cat);

                animals.add(cat);

                break;
            case "Tiger":
                Animal tiger = new Tiger(
                        tokens[1],
                        tokens[0],
                        Double.parseDouble(tokens[2]),
                        foodQuantity,
                        tokens[3]
                );

                printSound(tiger);

                tiger.eat(food.get(0));

                animals.add(tiger);
                break;
        }

        return animals.get(animals.size() - 1);
    }

    private static void toStringPrint(Animal animal) {
        System.out.println(animal.toString());
    }

    private static void printSound(Animal animal) {
        animal.makeSound();
    }
}
