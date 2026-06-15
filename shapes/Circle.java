
public class Circle extends Shape {

    private double radius;

    // Constructor
    public Circle(String color, boolean filled,
                  double radius) {

        super(color, filled);

        this.radius = radius;
    }

    // Area
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Perimeter
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // toString
    @Override
    public String toString() {

        return "[ Circle ]\n" +
               super.toString() + "\n" +
               "Radius: " + radius + "\n" +
               String.format("Area         : %.2f", getArea()) + "\n" +
               String.format("Circumference: %.2f", getPerimeter());
    }

    // Getter
    public double getRadius() {
        return radius;
    }
}
