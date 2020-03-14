package Company;

/**
 * @author DaydreaminE
 * @version 创建时间：2020年3月14日 下午4:04:07 类说明
 */
public class test {

	public static void main(String[] args) {

		// 创建临时工对象
		Employee hourly_Worker1 = new Hourly_Worker("A", 10, 200);
		Employee hourly_Worker2 = new Hourly_Worker("B", 10, 230);
		// 创建普通员工对象
		Employee normal_Emloyee = new Normal_Emloyee("C", 205, 40);
		// 创建销售员对象
		Employee salesman1 = new Salesman("D", 5000);
		Employee salesman2 = new Salesman("E", 200000);
		// 将上述对象放入Employee类数组中
		Employee[] employees = { hourly_Worker1, hourly_Worker2, normal_Emloyee, salesman1, salesman2 };

		// 创建珠宝工对象
		Employee jewelry_emloyee = new Jewelry_emloyee("F", 50);
		//创建公司对象，将employee数组放入公司对象中
		Company company = new Company(employees);
		company.get_Sale();
		//显示指定员工工资
		company.show_Sale("E");
		//添加珠宝工
		company.add_employee(jewelry_emloyee);
		company.get_Sale();
		//删除指定员工
		company.delete_employee("A");
		company.get_Sale();

	}

}
