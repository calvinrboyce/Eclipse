import java.util.*;
import java.io.*;

public class Tester {
	public static void main (String args[]) {
		
		Scanner kbReader = new Scanner(System.in);
		
		while (true) {
			
			try {
				System.out.println("Enter a file name (or \"exit\"):");
				String s = kbReader.next();
				if (s.equalsIgnoreCase("exit")) {
					break;
				}
				FileInput.readTheFile(s);
				break;
			}
			
			catch (IOException e) {
				System.out.println("Please enter a valid file name");
			}
		}
		kbReader.close();
	}
}
