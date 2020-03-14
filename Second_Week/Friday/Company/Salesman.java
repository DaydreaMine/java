package Company;

/**
 * @author DaydreaminE
 * @version 创建时间：2020年3月14日 下午3:37:26 类说明
 */
public class Salesman implements Employee {
	private String name;
	private double sale;

	public Salesman() {
	}

	public Salesman(String name, double sale) {
		super();
		this.name = name; 
		this.sale = sale;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSale() {
		return sale;
	}

	public void setSale(double sale) {
		this.sale = sale;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double salary() {
		if (sale < 10000 && sale > 0) {
			return sale * 0.1;
		} else if (sale > 10000 && sale < 100000) {
			return (sale - 10000) * 0.15 + 10000 * 0.1;
		} else {
			return (sale - 100000) * 0.18 + 100000 * 0.15 + 10000 * 0.1;
		}
	}

}
