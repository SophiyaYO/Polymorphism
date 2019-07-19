package vehicles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
                new BufferedReader(
                        new InputStreamReader(
                                System.in
                        )
                );

        String[] carInfo = reader.readLine().split("\\s+");
        String[] truckInfo = reader.readLine().split("\\s+");

        Vehicle car = new Car(Double.parseDouble(carInfo[1]), Double.parseDouble(carInfo[2]));
        Vehicle truck = new Truck(Double.parseDouble(carInfo[1]), Double.parseDouble(carInfo[2]));

        System.out.println(car.drivenDistance(9));
        System.out.println(truck.drivenDistance(10));
    }
}
