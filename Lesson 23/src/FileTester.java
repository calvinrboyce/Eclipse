import java.util.*;
import java.io.*;
public class FileTester {
	public static void main(String args[]) throws IOException {
		Scanner sf = new Scanner(new File("C:\\temp_Calvin\\MyData.txt"));
		
		int maxIndx = -1;
		String text[] = new String[1000];
		
		while (sf.hasNext()) {
			maxIndx++;
			text[maxIndx] = sf.nextLine();
		}
		
		for (int j=0; j<= maxIndx; j++) {
			System.out.println(text[j]);
		}
		
		sf.close();
	}
}
