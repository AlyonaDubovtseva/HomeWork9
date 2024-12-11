package hw09;

public class Figura {
    protected double x, y;

    public Figura() {}
    public Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getArea() {
        return 0.0;
    }

    public String toString() {
        return "Фигура с координатами (" + x + ", " + y + ")";
    }
}
