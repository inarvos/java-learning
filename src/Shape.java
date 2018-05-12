import java.util.Arrays;
import java.util.List;

public abstract class Shape {
	
	public double area() {return 0.0;}
	
	public static void main(String... args) {
		
		
		Circle c = new Circle(1.0);
		Rectangle r = new Rectangle(1.0, 1.0);
		Square sq = new Square(1.0);
		
		
		List<Shape> shapes = Arrays.asList(c, r, sq);
		
		double area = 0.0;
		
		for(Shape s : shapes) {
			area += s.area();
		}
		
		System.out.println(area);
		
	}

}




class Circle extends Shape {

	private double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}


	@Override
	public double area() {
		return Math.PI * radius * radius;
	}	
	
}

class Rectangle extends Shape {
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double area() {
		return width * height;
	}
	 
}

class Square extends Shape {
	private double side;
	
	public Square(double side) {
		this.side = side;
	}

	@Override
	public double area() {
		return side * side;
	}
}

