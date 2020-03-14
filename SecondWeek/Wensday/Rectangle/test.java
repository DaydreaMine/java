package Rectangle;

public class test {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.setBreadth(2);
		rectangle.setLength(3);
		System.out.println(rectangle.toString());
		rectangle.area();

		Square square = new Square(5, 1);
		square.setHeight(5);
		System.out.println(square.toString());
		square.area();
		square.Volume();
	}
}
