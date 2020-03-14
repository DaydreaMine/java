package Rectangle;

public class Rectangle {

	private int Length ;
	private int Breadth;
	public int area;
	
	public Rectangle(){
		
	};
	
	
	
	public Rectangle(int length, int breadth) {
		super();
		this.Length = length;
		this.Breadth = breadth;
	}



	public int getLength() {
		return Length;
	}
	public void setLength(int length) {
		this.Length = length;
	}
	public int getBreadth() {
		return Breadth;
	}
	public void setBreadth(int breadth) {
		this.Breadth = breadth;
	}
	
	public void area() {
		 this.area = this.getLength()*this.getBreadth();
		 System.out.println("面积为"+this.area);
	}
	
	public String toString() {
		return "长为"+this.getLength()+"宽为"+this.getBreadth();
	}
}
