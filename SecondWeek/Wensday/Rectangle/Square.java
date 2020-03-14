package Rectangle;


public class Square extends Rectangle {

     public int Volume;
     private int Height;
     
	public Square() {
		super();
	}
	
	public Square(int Length,int Breadth) {
		super(Length,Breadth);
		
	}
	
	public void setHeight(int height) {
		Height = height;
	}
	
	public int  getHeight() {
		return this.Height;
	}
	
	public void Volume() {
		Volume = this.getHeight()*this.getHeight()*this.getBreadth();
		System.out.println("体积为"+this.Volume);
	}
	
	public String toString() {
		return "长"+this.getLength()+"宽"+this.getBreadth()+"高"+this.getHeight()+"面积";
	}
	
     
}
