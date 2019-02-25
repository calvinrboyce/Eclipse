import java.util.*;
public class Tester {
	public static void main (String args[]) {
		Circle cir1 = new Circle(35.5);
		System.out.println( cir1.diameter( ) ); // should give 71.0 as the answer. 
		
		Scanner kbReader = new Scanner(System.in);
		System.out.println("What is the name of this account?");
		String n1 = kbReader.nextLine();
		System.out.println("What is the value in this account?");
		double b1 = kbReader.nextDouble();
		
		BankAccount myAccount = new BankAccount(b1, n1);
		
		myAccount.deposit(505.22);
		System.out.println(myAccount.balance);
		
		myAccount.withdraw(100);
		System.out.println("The "+myAccount.name+" account balance is, $"+myAccount.balance);
	}
}
