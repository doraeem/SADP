// Task-3 (Open/Closed Principle)

abstract class Shape1
{
    public abstract double calculateArea();
}
class Circle extends Shape1{
    private double radius;
    public Circle(double radius)
    {
        this.radius = radius;
    }  
    @Override
    public double calculateArea()
    {
        return 3.14 * radius* radius;
    } 
}
class Rectangle extends Shape1
{
    private double width;
    private double height;
    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }
    @Override
    public double calculateArea()
    {
        return width * height;
    }

}
class Main{
    public static void main(String[] args)
    {
        Shape1 circle = new Circle(5.0);
        System.out.println( "The Area of Circle is : " + circle.calculateArea());
        Shape1 rectangle = new Rectangle(4.0,6);
        System.out.println("The Area of Rectangle is : " +rectangle.calculateArea());
    }
}