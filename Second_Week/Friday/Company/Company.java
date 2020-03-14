package Company;

/**
 * @author DaydreaminE
 * @version 创建时间：2020年3月14日 上午9:44:34 类说明
 */
public class Company {

	// 初始化员工数组
	private Employee[] employees;

	// 初始化有参构造方法
	public Company(Employee[] employees) {
		super();
		this.employees = employees;
	}

	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}

	// 添加员工方法
	public void add_employee(Employee employee) {
		Employee[] employee1 = new Employee[employees.length + 1];
		for (int i = 0; i < employees.length; i++) {
			employee1[i] = employees[i];
		}
		employee1[employee1.length - 1] = employee;
		this.employees = employee1;
	}

	// 删除员工方法
	public void delete_employee(String name) {
		for (int i = 1; i < employees.length; i++) {
			if (name.equals(employees[i - 1].getName())) {
				for (int j = i - 1; j < employees.length - 1; j++) {
					employees[j] = employees[j + 1];
				}
			}
		}
		Employee[] employee2 = new Employee[employees.length - 1];
		for (int j = 0; j < employee2.length; j++) {
			employee2[j] = employees[j];
		}
		this.employees = employee2;
	}

	// 显示员工工资
	public void show_Sale(String name) {
		for (int i = 0; i < employees.length; i++) {
			if (name.equals(employees[i].getName())) {
				System.out.println(employees[i].getName() + "工资为" + employees[i].salary());
			}
		}
	}

	// 工资和
	public void get_Sale() {
		double sum = 0;
		for (int i = 0; i < employees.length; i++) {
			sum += employees[i].salary();
		}
		System.out.println("工资总和为" + sum + "元");
	}

}
