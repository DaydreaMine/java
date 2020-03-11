package Vehicle;

public class Car extends Vehicle {

	private int loader;

	public Car() {
	}

	public Car(int wheeels, double weight, int loader) {
		super(wheeels, weight);
		this.loader = loader;
	}

	public int getLoader() {
		return loader;
	}

	public void setLoader(int loader) {
		this.loader = loader;
	}

	public void function() {
		System.out.println("还是载人吧");
	}
	
	public String toString_3() {
		return "载人数"+this.getLoader();
	}
}
