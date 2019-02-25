import java.util.*;

public class Tester {
	public static void main(String args[]) {
		
		Scanner kbReader = new Scanner(System.in);
		boolean done = false;
		StackLL stck = new StackLL();
		
		while(!done) {
			System.out.print("Enter number, math operation(+,-,*,/), or Q to quit: ");
			if (kbReader.hasNextDouble()) {
				stck.push(kbReader.nextDouble()); 
			} else {
				String s = kbReader.next();
				if (s.equals("+")) {
					double a = stck.pop();
					double b = stck.pop();
					stck.push(a+b);
				} else if (s.equals("-")) {
					double a = stck.pop();
					double b = stck.pop();
					stck.push(b-a);
				} else if (s.equals("*")) {
					double a = stck.pop();
					double b = stck.pop();
					stck.push(a*b);
				} else if (s.equals("/")) {
					double a = stck.pop();
					double b = stck.pop();
					stck.push(b/a);
				} else if (s.equalsIgnoreCase("Q")) {
					System.out.println(stck.pop());
					done = true;
				}
			}
		}
		kbReader.close();
	}
}

