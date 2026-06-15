public abstract class Shape {

    private String color;
    private boolean filled;

    // Constructor
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Abstract Methods
    public abstract double getArea();
    public abstract double getPerimeter();

    // toString Method
    @Override
    public String toString() {
        return "Color : " + color + "\n" +
               "Filled: " + (filled ? "Yes" : "No");
    }

    // Getters and Setters
    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String c) {
        this.color = c;
    }

    public void setFilled(boolean f) {
        this.filled = f;
    }
}
