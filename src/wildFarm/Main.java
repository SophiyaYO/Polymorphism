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

        Map<String, List <Animal>> animals = new LinkedHashMap<>();

        animals.putIfAbsent("Mouse",new ArrayList<>());
        animals.putIfAbsent("Zebra",new ArrayList<>());
        animals.putIfAbsent("Cat",new ArrayList<>());
        animals.putIfAbsent("Tiger",new ArrayList<>());

        List<Food> foodList = new ArrayList<>();

        int count = 0;
        String input;
        while (!"end".equalsIgnoreCase(input = reader.readLine())) {
            count++;

            if (count % 2 == 0) {
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
                        animals.get("Mouse").add(produceAnimal(animalTokens, foodList));

                        foodList.remove(0);

                        break;

                    case "Zebra":
                        animals.get("Zebra").add(produceAnimal(animalTokens, foodList));

                        foodList.remove(0);

                        break;

                    case "Cat":
                        animals.get("Cat").add(produceAnimal(animalTokens, foodList));

                        foodList.remove(0);

                        break;

                    case "Tiger":
                        animals.get("Tiger").add(produceAnimal(animalTokens, foodList));

                        foodList.remove(0);

                        break;
                }

            }
        }

        for (Map.Entry<String, List<Animal>> kv : animals.entrySet()) {
            for (Animal animal : kv.getValue()) {
                System.out.println(animal.toString());
            }
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

                animals.add(cat);

                break;
            case "Tiger":
                Animal tiger = new Zebra(
                        tokens[1],
                        tokens[0],
                        Double.parseDouble(tokens[2]),
                        foodQuantity,
                        tokens[3]
                );

                animals.add(tiger);
                break;
        }

        return animals.get(animals.size()-1);
    }
}
