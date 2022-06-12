package chapter10;

public class Circle extends GeometricShape {
    private double radius;

    public Circle (String color, double radius) {
        super(color);
        this.radius = radius;
    }
    @Override
    public String getName() {
        return "円形";
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
