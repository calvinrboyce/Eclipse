
import java.util.*;

public class Tester {
	public static void main (String args[]) {
		
		Scanner kbReader = new Scanner(System.in);
		String name;
		double balance;
		Map<Integer, BankAccount>accounts = new HashMap<>();
		
		for (int i=0; i<4; i++) {
			
			System.out.print("Please enter the name to whom the account belongs. ");
			name = kbReader.nextLine();
			
			System.out.print("Please enter the amount of the deposit. ");
			balance = kbReader.nextDouble();
			kbReader.nextLine();
			System.out.println("");
			
			BankAccount ba = new BankAccount(name, balance);
			accounts.put(ba.accountID, ba);
		}
		
		Set<Integer> accountsSet = accounts.keySet();
		Iterator<Integer> iter = accountsSet.iterator();
		
		while(iter.hasNext()) {
			Object key = iter.next();
			BankAccount ba = accounts.get(key);
			System.out.printf("%d>>>%s>>>%10.2f", ba.accountID, ba.name, ba.balance);
			System.out.println("");
		}
		System.out.println("");
		
		System.out.print("Please enter the ID for the account that you wish to view. ");;
		Integer id = kbReader.nextInt();
		BankAccount ba = accounts.get(id);
		System.out.printf("%d>>>%s>>>%10.2f", ba.accountID, ba.name, ba.balance);
		
		kbReader.close();
	}
}