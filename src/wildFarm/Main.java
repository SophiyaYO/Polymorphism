package wildFarm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        Map<String, Animal> animals = new LinkedHashMap<>();
        List<Food> foodList = new ArrayList<>();

        int count = 0;
        String input;
        while (!"end".equalsIgnoreCase(input = reader.readLine())) {
            count++;

            if (count % 2 != 0) {
                String[] foodTokens = input.split("\\s+");
                if (foodTokens[0].equalsIgnoreCase("Vegetable")) {
                    Food vegetable = new Vegetable(Integer.parseInt(foodTokens[1]));
                    foodList.add(vegetable);

                } else {
                    Food meat = new Meat(Integer.parseInt(foodTokens[1]));
                    foodList.add(meat);

                }

            } else {
                String[] animalTokens = input.split("\\s+");

                switch (animalTokens[0]) {
                    case "Mouse":
                        animals.putIfAbsent("Mouse",
                                produceAnimal(animalTokens, foodList));

                        animals.put("Mouse",
                                produceAnimal(animalTokens, foodList));

                        foodList.remove(0);

                        break;
                    case "Zebra":
                        animals.putIfAbsent("Zebra",
                                produceAnimal(animalTokens, foodList));

                        animals.put("Zebra",
                                produceAnimal(animalTokens, foodList));

                        foodList.remove(0);
                        break;
                    case "Cat":

                        break;
                    case "Tiger":

                        break;
                }

            }


        }
    }

    private static Animal produceAnimal(String[] tokens, List<Food> food) {
        Integer foodQuantity = food.get(0).getQuantity();

        switch (tokens[0]) {
            case "Mouse":
                Animal mouse = new Mouse(
                        tokens[1],
                        tokens[0],
                        Double.parseDouble(tokens[2]),
                        foodQuantity,
                        tokens[3]
                );

                break;

            case "Zebra":
                Animal zebra = new Zebra(
                        tokens[1],
                        tokens[0],
                        Double.parseDouble(tokens[2]),
                        foodQuantity,
                        tokens[3]
                );

                break;

            case "Cat":

                break;
            case "Tiger":

                break;
        }

        return Animal;
    }
}
