class Shape {
    protected double area;
    public Shape() {
        area = 0;
    }

    public Shape(double area) {
        this.area = area;
    }
}
class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        area = calculateArea();
    }

    private double calculateArea() {
        return length * width;
    }

    public void display() {
        System.out.println("Rectangle - Length: " + length + ", Width: " + width + ", Area: " + area);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        area = calculateArea();
    }

    private double calculateArea() {
        return Math.PI * radius * radius;
    }

    public void display() {
        System.out.println("Circle - Radius: " + radius + ", Area: " + area);
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 4.0);
        Circle circle = new Circle(3.0);
        rectangle.display();
        circle.display();
    }
}
