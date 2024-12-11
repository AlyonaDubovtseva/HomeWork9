package hw09;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(0, 0, 5);
        Rectangle rectangle = new Rectangle(1, 2, 4, 6);
        Triangle triangle = new Triangle(2, 3, 4, 5);

        Cube cube = new Cube(0, 0, 3);
        Parallelepiped parallelepiped = new Parallelepiped(1, 1, 4, 6, 3);

        System.out.println(circle);
        System.out.println("Площадь: " + circle.getArea() + ". Длина окружности: " + circle.Circumference() + "\n");

        System.out.println(rectangle);
        System.out.println("Площадь: " + rectangle.getArea() + ". Периметр: " + rectangle.getPerimeter() + "\n");

        System.out.println(triangle);
        System.out.println("Площадь: " + triangle.getArea() + "\n");

        System.out.println(cube);
        System.out.println("Площадь поверхности: " + cube.getArea() + "\n");

        System.out.println(parallelepiped);
        System.out.println("Площадь поверхности: " + parallelepiped.getArea() + "\n");
    }
}
