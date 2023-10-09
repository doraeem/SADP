// Define an interface
interface Shape {
    double calculateArea();
}

// Create classes that implement the interface
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

// Another class that takes a Shape as a parameter in its constructor
class AreaCalculation {
    private Shape shape;

    public AreaCalculation(Shape shape) {
        this.shape = shape;
    }

    public double calculateArea() {
        return shape.calculateArea();
    }
}

 class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(6, 8);

        AreaCalculation circleCalculation = new AreaCalculation(circle);
        AreaCalculation rectangleCalculation = new AreaCalculation(rectangle);

        System.out.println("Circle Area: " + circleCalculation.calculateArea());
        System.out.println("Rectangle Area: " + rectangleCalculation.calculateArea());
     
    }
}
