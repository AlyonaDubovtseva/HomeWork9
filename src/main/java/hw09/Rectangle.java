package hw09;

class Rectangle extends Figura {
    protected double width, height;

    public Rectangle(){}
    public Rectangle(double x, double y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
    @Override
    public double getArea() {
        return width * height;
    }

    public String toString() {
        return "Прямоугольник с координатами (" + x + ", " + y + ")";
    }

}
