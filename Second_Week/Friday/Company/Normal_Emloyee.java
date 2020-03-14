package Company;

/**
 * @author DaydreaminE
 * @version 创建时间：2020年3月14日 下午3:53:21 类说明
 */
public class Normal_Emloyee implements Employee {
	private String name;
	private double work_hours;
	private double basic_sale;

	public Normal_Emloyee() {
	}

	public Normal_Emloyee(String name, double work_hours, double basic_sale) {
		super();
		this.name = name;
		this.work_hours = work_hours;
		this.basic_sale = basic_sale;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWork_hours() {
		return work_hours;
	}

	public void setWork_hours(double work_hours) {
		this.work_hours = work_hours;
	}

	public double getBasic_sale() {
		return basic_sale;
	}

	public void setBasic_sale(double basic_sale) {
		this.basic_sale = basic_sale ;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double salary() {
		if (work_hours < 196 && work_hours > 0) {
			return basic_sale;
		} else {
			return (work_hours - 196) * 200 + basic_sale;
		}
	}

}
