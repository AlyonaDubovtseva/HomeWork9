package hw09;
import java.util.*;

public class Circle extends Figura {
    private double radius;

    public Circle() {}

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double Circumference() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Круг с координатами (" + x + ", " + y + ")";
    }



}

