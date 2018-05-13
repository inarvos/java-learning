import java.util.Arrays;
import java.util.List;

public abstract class Shape {
	
	public abstract double area();
	
	public static void main(String... args) {
		
		class Pentagon extends Shape {
			
			private double side;

			public Pentagon(double side) {
				this.side = side;
			}
			
			@Override
			public double area() {
				return side * side * Math.sqrt(25 + 10 * Math.sqrt(5.0)) / 4;
			}
			
		}
		
		
		Circle c = new Circle(1.0);
		Rectangle r = new Rectangle(1.0, 1.0);
		Square sq = new Square(1.0);
		TriangleWrapper wrapper = new TriangleWrapper();
		RectangularTriangle rectr = new RectangularTriangle(10);
		
		
		Pentagon pentagon = new Pentagon(1.0);
		System.out.println("Pentagon area = " + pentagon.area());
		
		
		TriangleWrapper.EquilateralTriangle tr = wrapper.new EquilateralTriangle(1.0);
		
		
		
		List<Shape> shapes = Arrays.asList(c, r, sq, tr, pentagon, rectr);
		
		double area = 0.0;
		
		for(Shape s : shapes) {
			area += s.area();
		}
		
		System.out.println(area);
		
	}
	
	
	private static class RectangularTriangle extends Shape {

		private final double catetus;
		
		public RectangularTriangle(double other) {
			this.catetus = other;
		}
		
		@Override
		public double area() {
			return 1/2 * catetus * catetus;
		}
		
	}
	

}


class TriangleWrapper {
	
		public class EquilateralTriangle extends Shape {
		
		private final double side;
		
		public EquilateralTriangle(double other) {
			super();
			this.side = other;
		}

		public double getSide() {
			return side;
		}

		@Override
		public double area() {
			
			return side * side / 2;
		}
		
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

