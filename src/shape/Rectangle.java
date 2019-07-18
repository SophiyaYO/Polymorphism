package shape;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.setWidth(width);
        this.setHeight(height);
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
   public double calculatePerimeter() {
        return 2 * this.getWidth() + 2*this.getHeight();
    }

    @Override
   public double calculateArea() {
        return this.getWidth() * this.getHeight();
    }
}
