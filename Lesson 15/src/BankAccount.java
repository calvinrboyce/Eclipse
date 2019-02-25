
public class BankAccount {
	public double balance;
	public String name;
	
	public BankAccount(double b, String n) {
		balance = b;
		name = n;
	}
	
	public void deposit (double dep) {
		balance += dep;
	}
	public void withdraw (double with) {
		balance -= with;
	}
}
