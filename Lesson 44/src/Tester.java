
import java.util.*;

public class Tester {
	public static void main (String args[]) {
		Scanner kbReader = new Scanner(System.in);
		String name;
		double balance;
		
		BankAccount[] ba = new BankAccount[5];
		for (int i=0; i<ba.length; i++) {
			
			System.out.print("Please enter the name to whom the account belongs. ");
			name = kbReader.nextLine();
			
			System.out.print("Please enter the amount of the deposit. ");
			balance = kbReader.nextDouble();
			kbReader.nextLine();
			System.out.println("");
			
			ba[i] = new BankAccount(balance, name);
			
		}
		
		Arrays.sort(ba);
		
		for (int i=0; i<ba.length; i++) {
			System.out.printf("%s >>> %.2f", ba[i].name, ba[i].balance);
			System.out.println("");
		}
		kbReader.close();
	}
}