package Vehicle;

public class Truck extends Vehicle {

	private double payload;

	public Truck() {
	}

	public Truck(int wheels, double weihght, double payload) {
		super(wheels, weihght);
		this.payload = payload;
	}

	public double getPayload() {
		return payload;
	}

	public void setPayload(double payload) {
		this.payload = payload;
	}
	
	public void function() {
		System.out.println("不但能载人还能载货");
	}
	
	public String tosString_2() {
		return "载重量"+this.getPayload();
	}

}
