import java.io.*;
import java.util.*;

public class AlphNames {
	public static void main (String args[]) throws IOException {
		
		Scanner sf = new Scanner(new File("C:\\temp_Calvin\\Names.txt"));
		int maxIndx = -1;
		String text[] = new String[1000];
		
		while (sf.hasNext()) {
			maxIndx++;
			text[maxIndx] = sf.nextLine();
		}
		sf.close();
		
		String reversedName[] = new String[maxIndx + 1];
		for (int j=0; j<=maxIndx; j++) {
			Scanner sc = new Scanner(text[j]);
			
			String firstName = sc.next();
			String lastName = sc.next();
			reversedName[j] = lastName + ", " + firstName;
			sc.close();
		}
		
		Arrays.sort(reversedName);
		for (int j=0; j<=maxIndx; j++) {
			System.out.println( reversedName[j]);
		}
		
	}

}
