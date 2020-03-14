package Company;

/**
 * @author DaydreaminE
 * @version 创建时间：2020年3月14日 上午11:30:53 类说明
 */
public class Hourly_Worker implements Employee {
	private String name;
	private double work_hours;
	private double work_salary;

	public Hourly_Worker() {
	}

	public Hourly_Worker(String name, double work_hour, double work_salary) {
		super();
		this.name = name;
		this.work_hours = work_hour;
		this.work_salary = work_salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWork_hour() {
		return work_hours;
	}

	public void setWork_hour(double work_hour) {
		this.work_hours = work_hour;
	}

	public double getWork_salary() {
		return work_salary;
	}
 
	public void setWork_salary(double work_salary) {
		this.work_salary = work_salary;
	}

	// 重写临时工接收名字方法
	@Override
	public String getName() {
		return name;
	}

	// 重写临时员工工资方法
	@Override
	public double salary() {
		return this.getWork_hour() * this.getWork_salary();
	}

}
