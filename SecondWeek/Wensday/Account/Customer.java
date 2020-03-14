package Account;

public class Customer extends Account {

	private String firstName;
	private String lastName;
	private String account;

	public Customer() {
	}

	public Customer(String firstName, String lastName, String id, double balance, double annualInterestRate) {
		super(id, balance, annualInterestRate);
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String tostString_1() {
		return "Customer [" + this.getLastName() + this.getFirstName() + "] has a account : " + this.toString();
	}

	public void display() {
		System.out.println(this.tostString_1());
	}

}
