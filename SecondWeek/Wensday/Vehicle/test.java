package Vehicle;

public class test {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle(4,3.5);
		System.out.println(vehicle.tosString());
		vehicle.function();
		
		Car car = new Car(4,3.0,5);
		System.out.print(car.tosString());
		System.out.println(car.toString_3());
		car.function();
		
		Truck truck = new Truck(6,5.5,10);
		System.out.print(truck.tosString());
		System.out.println(truck.tosString_2());
		truck.function();
		
	}
}
