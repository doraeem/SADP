abstract class Shape
{
    public abstract double calculateArea();
}
class Circle extends Shape{
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
class Rectangle extends Shape
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
class main{
    public static void main(String[] args)
    {
        Shape circle = new Circle(5.0);
        System.out.println( "The Area of Circle is : " + circle.calculateArea());
        Shape rectangle = new Rectangle(4.0,6);
        System.out.println("The Area of Rectangle is : " +rectangle.calculateArea());
    }
}