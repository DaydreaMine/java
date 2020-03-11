package Account;

public class Account {

	private String id;
	private double balance;
	private double annauallnterestRate;

	public Account() {
	}

	public Account(String id, double balance, double annauallnterestRate) {
		super();
		this.id = id;
		this.balance = balance;
		this.annauallnterestRate = annauallnterestRate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnauallnterestRate() {
		return annauallnterestRate;
	}

	public void setAnnauallnterestRate(double annauallnterestRate) {
		this.annauallnterestRate = annauallnterestRate;
	}

	public void withdraw(double money1) {
		if (money1 > this.getBalance()) {
			System.out.println("您的余额不足");
		} else {
			this.balance -= money1;
			System.out.println("您取出的金额为" + money1 + "余额为" + this.getBalance());
		}
	}

	public void deposit(double money2) {

		this.balance += money2;
		System.out.println("您存入的金额为" + money2 + "余额为" + this.getBalance());

	}

	public String toString() {
		return " id is " + this.getId() + "a nnualInterestRate is " + this.getAnnauallnterestRate() + " balance is"
				+ this.getBalance();
	}
}
