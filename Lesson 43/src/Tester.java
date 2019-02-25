
import java.util.*;

public class Tester {
	public static void main (String args[]) {
		Scanner kbReader = new Scanner(System.in);
		List<BankAccount> aryLst = new ArrayList<>();
		String name;
		double balance;
		ListIterator<BankAccount> itr = aryLst.listIterator();
		
		boolean done = false;
		while(!done) {
			System.out.print("Please enter the name to whom the account belongs. (\"Exit\" to abort) ");
			name = kbReader.nextLine();
			if (name.equalsIgnoreCase("exit")) {
				System.out.println("");
				break;
			}//exit function
			
			System.out.print("Please enter the amount of the deposit. ");
			balance = kbReader.nextDouble();
			kbReader.nextLine();
			BankAccount theAccount = new BankAccount(balance, name);
			itr.add(theAccount);

			System.out.println("");
		}//run names and balances
		
		if(itr.hasPrevious()) {
			
			BankAccount ba = itr.previous();
			while(itr.hasPrevious()) {
				if (itr.previous().balance>ba.balance) {
					ba = itr.next();
					itr.next();
				}
			}
			
			System.out.println("The account with the largest balance belongs to " + ba.name);
			System.out.println("The amount is $" + ba.balance);
		}
		
		
		kbReader.close();
	}
}
