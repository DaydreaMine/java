package Company;

/**
 * @author DaydreaminE
 * @version 创建时间：2020年3月14日 下午4:00:08 类说明
 */
public class Jewelry_emloyee implements Employee {

	private String name;
	private int jewelry_Num;

	public Jewelry_emloyee() {
	}

	public Jewelry_emloyee(String name, int jewelry_Num) {
		super();
		this.name = name;
		this.jewelry_Num = jewelry_Num;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJewelry_Num() {
		return jewelry_Num;
	}

	public void setJewelry_Num(int jewelry_Num) {
		this.jewelry_Num = jewelry_Num;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double salary() {
		return jewelry_Num * 50;
	}

}
