package shape;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(3, 4);
        Shape rectangle1 = new Rectangle(5, 6);
        Shape circle = new Circle(5);
        Shape circle1 = new Circle(534);

        List<Shape> shapes = new ArrayList<>();

        shapes.add(rectangle);
        shapes.add(rectangle1);
        shapes.add(circle);
        shapes.add(circle1);

        for (Shape shape : shapes) {
            System.out.println(shape.calculateArea());
        }
    }
}
