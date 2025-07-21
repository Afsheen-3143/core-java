package abstraction;

//public class Abstra3 {
//
//}
abstract class Shape {
    protected String color;
    
    public Shape(String color) {
        this.color = color;
    }
    
    // Abstract methods
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    
    // Concrete method
    public String getColor() {
        return color;
    }
}

class Circle extends Shape {
    private double radius;
    
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

	public double getRadius() {
		// TODO Auto-generated method stub
		return radius;
	}
}

public class Abstra3 {
	public static void main(String[] args) {
		// Main class to demonstrate the abstraction
				        // Create a Circle object
		        Circle circle = new Circle("Red", 5.0);
		        
		        // Use methods from abstract Shape class
		        System.out.println("Shape Color: " + circle.getColor());
		        
		        // Use implemented abstract methods
		        System.out.println("Circle Area: " + circle.calculateArea());
		        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
		        
		        // Use Circle-specific method
		        System.out.println("Circle Radius: " + circle.getRadius());
		        
		        // Polymorphism example - using Shape reference
		        Shape shape = new Circle("Blue", 3.0);
		        System.out.println("\nUsing Shape reference:");
		        System.out.println("Area: " + shape.calculateArea());
		        System.out.println("Perimeter: " + shape.calculatePerimeter());
		        System.out.println("Color: " + shape.getColor());
		        
		        // This would cause compilation error - getRadius() not in Shape
		        // System.out.println("Radius: " + shape.getRadius());
		    }
		}