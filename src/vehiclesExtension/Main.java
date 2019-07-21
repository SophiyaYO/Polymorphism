package vehiclesExtension;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        Vehicle car = produceVehicle(reader.readLine().split("\\s+"));
        Vehicle truck = produceVehicle(reader.readLine().split("\\s+"));

        Map<String, Vehicle> vehicles = new HashMap<>();

        vehicles.putIfAbsent("Car", car);
        vehicles.putIfAbsent("Truck", truck);

        int n = Integer.parseInt(reader.readLine());


        while (n-- > 0) {
            String[] tokens = reader.readLine().split("\\s+");

            String output = null;
            if (tokens[0].equalsIgnoreCase("drive")) {
                output = vehicles.get(tokens[1]).drivenDistance(Double.parseDouble(tokens[2]));
            } else {
                vehicles.get(tokens[1]).refueledLiters(Double.parseDouble(tokens[2]));

            }

            if (output != null) {
                System.out.println(output);
            }


        }

        vehicles
                .forEach((key, value) ->
                        System.out.println(value)
                );
    }

    public static Vehicle produceVehicle(String[] data) {

        Vehicle vehicle = null;

        if (data[0].equalsIgnoreCase("car")) {
            vehicle =
                    new Car(
                            Double.parseDouble(data[1]),
                            Double.parseDouble(data[2]));

        } else if (data[0].equalsIgnoreCase("truck")) {
            vehicle =
                    new Truck(
                            Double.parseDouble(data[1]),
                            Double.parseDouble(data[2]));
        }

        return vehicle;

    }
}
