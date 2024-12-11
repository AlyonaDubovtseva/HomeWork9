package hw09;

class Parallelepiped extends Rectangle {
    private double depth;

    public Parallelepiped() {}

    public Parallelepiped(double x, double y, double width, double height, double depth) {
        super(x, y, width, height);
        this.depth = depth;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    @Override
    public double getArea() {
        return 2 * (width * height + width * depth + height * depth);
    }

    public String toString() {
        return "Параллелепипед с координатами (" + x + ", " + y + ")";
    }

}
