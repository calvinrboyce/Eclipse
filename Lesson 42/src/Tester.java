
import java.util.*;

public class Tester {
	public static void main (String args[]) {
		Scanner kbReader = new Scanner(System.in);
		List<BankAccount> aryLst = new ArrayList<>();
		String name;
		Double balance;
		
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
			aryLst.add(new BankAccount(balance, name));
			System.out.println("");
		}//run names and balances
		
		int max = 0;
		
		if(aryLst.size()>0) {
			for (int i=0; i<aryLst.size(); i++) {
				if (aryLst.get(i).balance > aryLst.get(max).balance) {
					max = i;
				}
			}
			
			System.out.println("The account with the largest balance belongs to " + aryLst.get(max).name);
			System.out.println("The amount is $" + aryLst.get(max).balance);
		}
		
		
		kbReader.close();
	}
}
