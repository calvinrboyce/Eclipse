import java.io.*;
import java.util.*;

public class Main {
	public static void main (String args[]) throws IOException {
		
		Scanner sf = new Scanner(new File("C:\\temp_Calvin\\Motivation.txt"));
		sf.useDelimiter("\r\n\r\n");
		
		int maxIndx = -1;
		String text[] = new String[10];
		while (sf.hasNext()) {
			maxIndx++;
			text[maxIndx] = sf.next();
		}//fill text array
		
		Random rndm = new Random();
		
		System.out.print(text[rndm.nextInt(10)]);
		sf.close();
	}
}
