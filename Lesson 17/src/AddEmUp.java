
import java.util.*;
public class AddEmUp {
	 public static void main(String args[]) {
		 Scanner kb = new Scanner(System.in);

		 System.out.print("Enter something like 8 + 33 + 1,345 +137 : ");
		 String s = kb.nextLine( ); //Best to store in a String and then create a new Scanner
		 							//object; otherwise, it can get stuck waiting for input.
		 Scanner sc = new Scanner(s);
		 //Set delimiters to a plus sign surrounded by any amount of white space...or...
		 // a minus sign surrounded by any amount of white space.
		 sc.useDelimiter("\\s*\\+\\s*");
		 
		//remove "+" and write in middle
		 String middle = "";
		 while(sc.hasNext( )) {
			 middle = middle + sc.next( );
			 middle = middle + " ";
		 }
		 
		 //remove white space and add integers to sum, add other char to other, then subtract int from sum
		 Scanner cn = new Scanner(middle);
		 int sum = 0;
		 String value = "";
		 String other = "";
			while (cn.hasNext()) { 
			 	if (cn.hasNextInt()) {
			 		sum = sum + cn.nextInt();
			 	} else {
			 		other = other + cn.next();
			 		value = cn.next();
			 		Scanner x = new Scanner(value);
			 		sum = sum - x.nextInt();
			 		x.close();
			 	}
		 	}
		 
		 System.out.println("Sum is: " + sum);
		 
		 
		 kb.close();
		 sc.close();
		 cn.close();
	 }
} 
