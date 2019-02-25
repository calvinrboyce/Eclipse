
public class BankAccount implements Comparable<BankAccount> {
	
	public double balance;
	public String name;
	private static int accountCounter = 0;
	public int accountID;
	
	public BankAccount(String n, double b) {
		balance = b;
		name = n;
		accountCounter++;
		accountID = accountCounter;
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
