package Account;

public class Test {

	public static void main(String[] args) {

		Customer customer = new Customer("孙", "大圣", "10000", 1000000, 0.23);

		customer.deposit(404);
		customer.withdraw(3000);
		customer.withdraw(1111111111);
		customer.display();
	}
}
