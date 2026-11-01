import java.util.List;

/**
 * Inheritance + polymorphism practice.
 * Shape is abstract; Circle and Rectangle each give their own area().
 * The loop in main() calls area() without knowing the exact type.
 */
abstract class Shape {

    private final String name;

    protected Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double area();

    @Override
    public String toString() {
        return String.format("%s with area %.2f", name, area());
    }
}

class Circle extends Shape {

    private final double radius;

    Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {

    private final double width;
    private final double height;

    Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

public class Shapes {

    public static void main(String[] args) {
        List<Shape> shapes = List.of(new Circle(2), new Rectangle(3, 4));
        for (Shape s : shapes) {
            System.out.println(s); // polymorphism: each shape uses its own area()
        }
    }
}
