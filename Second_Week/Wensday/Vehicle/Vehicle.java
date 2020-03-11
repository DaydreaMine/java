package Vehicle;

public class Vehicle {

	private int wheels;
	private double weight;
	
	public Vehicle() {}

	public Vehicle(int wheels, double weight) {
		super();
		this.wheels = wheels;
		this.weight = weight;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void function() {
		System.out.println("汽车可以在地上开");
	}
	
	public String tosString() {
		return "车轮数"+this.getWheels()+"车重"+this.getWeight();
	}

}
