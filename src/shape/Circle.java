package shape;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.setRadius(radius);
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
   public double calculatePerimeter() {
        return 2 * Math.PI * this.getRadius();
    }

    @Override
   public double calculateArea() {
        return Math.PI * this.getRadius() * this.getRadius();
    }
}
