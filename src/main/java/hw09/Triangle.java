package hw09;

class Triangle extends Figura {
    private double base, height;

    public Triangle() {}
    public Triangle(double x, double y, double base, double height) {
        super(x, y);
        this.base = base;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    public String toString() {
        return "Треугольник с координатами (" + x + ", " + y + ")";
    }
}