import java.util.*;
public class NameReversal {
	public static void main (String args[])
	{
		System.out.print("Please enter your name. ");
		Scanner kbReader = new Scanner(System.in);
		String name = kbReader.nextLine();
		name = name.toLowerCase();
		int i = name.length();
		String reverse = "";
		for (int x=0; x<i; x++)
		{
			reverse = reverse + name.substring((i-x)-1, i-x);
		}
		System.out.print(reverse);
		kbReader.close();
	}
}
