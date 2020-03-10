package Elephant;
/*
* 在Elephant中增加一个静态成员，统计被创建出来的大象对象的数量，私有化这个静态成员，提供静态的get和set方法
* 在Elephant中增加一个静态成员，计算大象对象的平均身高，私有化这个静态成员，提供静态的get和set方法
*/

public class Elephant {
	private double height;
	private double weight;
	private String name;
	private String address;
	
	
	public Elephant() {};
	
	public void set_Address(String address) {
		this.address=address;
	}
	
	public void set_Name(String name) {
		this.name=name;
	}
	
	public void set_Height(double d) {
		this.height=d;
	}
	
	public void set_Weight(Double weight) {
		this.weight=weight;
	}
	
	public String get_Address(){
		return this.address;
	}
	
	public String get_Name() {
		return this.name;
	}
	
	public double get_Height() {
		return this.height;
	}
	
	public double get_Weight() {
		return this.weight;
	}
	
	public static void sum_height() {
		
	}
	

}
