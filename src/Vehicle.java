import java.util.Arrays;
import java.util.List;

public abstract class Vehicle {
	
	private String name;
	
	public Vehicle(String aName) {
		this.name = aName;
	}

	public abstract void start();
	
	void stop() {
		System.out.println(String.format("Vehicle %s has been stopped", this.name));
	}
	
	public String getName() {
		return name;
	}
	
	
	public static void main(String... args) {
		Car c = new Car("Mercedes", 2000);
		
		Bycicle b = new Bycicle("Cube", "Black");
	
		List<Vehicle> vehicles = Arrays.asList(c, b);
		
		for(Vehicle v : vehicles) {
			v.start();
		}
		
		
		for(Vehicle v : vehicles) {
			v.stop();
		}
		
	
	}
	
}


class Bycicle extends Vehicle {

	private String color;
	
	public Bycicle(String aName, String color) {
		super(aName);
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	@Override
	public void start() {
		System.out.println(String.format("Bycicle %s with color %s has been started", getName(), color));
	}
	
	@Override
	public void stop() {
		super.stop();
		System.out.println("Clean up bycicle");
	}
	
}

class Car extends Vehicle {

	private int buildYear;
	
	public Car(String aName, int buildYear) {
		super(aName);
		this.buildYear = buildYear;
	}
	
	public int getBuildYear() {
		return buildYear;
	}

	@Override
	public void start() {
		System.out.println(String.format("Car %s with build year %d has been started", getName(), buildYear));
	}
	
}
