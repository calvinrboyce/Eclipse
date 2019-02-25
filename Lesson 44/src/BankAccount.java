
public class BankAccount implements Comparable<BankAccount> {
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
	
	public int compareTo(BankAccount otherAccount) {
		
		int retValue;
		if(balance>otherAccount.balance) {
			retValue = 1;
		} else if(balance==otherAccount.balance) {
			retValue = 0;
		} else {
			retValue = -1;
		}
		
		return retValue;
	}
}
