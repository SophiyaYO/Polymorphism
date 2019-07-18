package shape;

public class Circle extends Shape {
    private Double radius;

    public Circle(double radius) {
        this.radius=(radius);
    }

    public final Double getRadius() {
        return this.radius;
    }

    @Override
   protected void calculatePerimeter() {
        setPerimeter(2 * Math.PI * this.getRadius());
    }

    @Override
   protected void calculateArea() {
        setArea(Math.PI * this.getRadius() * this.getRadius());
    }
}
