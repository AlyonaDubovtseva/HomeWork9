package hw09;

class Cube extends Rectangle {
    private double side;

    public Cube() {}

    public Cube(double x, double y, double side) {
        super(x, y, side, side);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return 6 * side * side;
    }

    public String toString() {
        return "Куб с координатами (" + x + ", " + y + ")";
    }

}
