

public class Rectangle extends Shape {

    private double width;
    private double length;

    // Constructor
    public Rectangle(String color, boolean filled,
                     double width, double length) {

        super(color, filled);

        this.width = width;
        this.length = length;
    }

    // Area
    @Override
    public double getArea() {
        return width * length;
    }

    // Perimeter
    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    // toString
    @Override
    public String toString() {

        return "[ Rectangle ]\n" +
               super.toString() + "\n" +
               "Width : " + width + "\n" +
               "Length: " + length + "\n" +
               String.format("Area      : %.2f", getArea()) + "\n" +
               String.format("Perimeter : %.2f", getPerimeter());
    }

    // Getters
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
}
