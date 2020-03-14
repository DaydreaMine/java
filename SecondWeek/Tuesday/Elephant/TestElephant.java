package Elephant;

public class TestElephant {

	public static void main(String[] args) {
		Elephant elephant = new Elephant();
		elephant.set_Name("A");
		elephant.set_Address("Asia");
		elephant.set_Height(2.2);
		elephant.set_Weight(5.0);
		ElephantVoid.set_Num(elephant);
		
		Elephant elephant2 = new Elephant();
		elephant.set_Name("B");
		elephant.set_Address("Africa");
		elephant.set_Height(2.1);
		elephant.set_Weight(5.4);
		ElephantVoid.set_Num(elephant2);
		
		Elephant elephant3 = new Elephant();
		elephant.set_Name("C");
		elephant.set_Address("Europe");
		elephant.set_Height(3.2);
		elephant.set_Weight(4.0);
		ElephantVoid.set_Num(elephant3);
		
		Elephant elephant4 = new Elephant();
		elephant.set_Name("D");
		elephant.set_Address("America");
		elephant.set_Height(2.4);
		elephant.set_Weight(5.2);
		ElephantVoid.set_Num(elephant4);
		
		ElephantVoid.set_avg(4);
		
	    System.out.println(ElephantVoid.get_Num()+ElephantVoid.get_Avg());
		
		
		
	}
}
