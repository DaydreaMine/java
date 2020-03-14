package Company;

/**
 * @author DaydreaminE
 * @version 创建时间：2020年3月14日 下午4:04:07 类说明
 */
public class test {

	public static void main(String[] args) {

		Employee hourly_Worker1 = new Hourly_Worker("A", 10, 200);
		Employee hourly_Worker2 = new Hourly_Worker("B", 10, 230);
		Employee normal_Emloyee = new Normal_Emloyee("C", 205, 40);
		Employee salesman1 = new Salesman("D", 5000);
		Employee salesman2 = new Salesman("E", 200000);
		Employee jewelry_emloyee = new Jewelry_emloyee("F", 50);

		Employee[] employees = { hourly_Worker1, hourly_Worker2, normal_Emloyee, salesman1, salesman2 };
		Company company = new Company(employees);
		company.show_Sale("E");
		company.get_Sale();
		company.add_employee(jewelry_emloyee);
		company.get_Sale();
		company.delete_employee("A");
		company.get_Sale();

	}

}
