import java.io.*;
import java.util.*;

public class BaseClass {
	public static void main(String args[]) throws IOException {
		
		//scanner object
		Scanner sf = new Scanner(new File("C:\\temp_Calvin\\FileName.in"));
		
		int maxIndx = -1;
		String text[] = new String[1000];
		while(sf.hasNext()) {
			maxIndx++;
			text[maxIndx] = sf.nextLine();
		}//fill text[]
		sf.close();
		
		//process text[]
		for(int j=0; j<=maxIndx; j++) {
			Scanner sc = new Scanner(text[j]);
			
			
			
			sc.close();
		}//process text[]
		
		
	}
}
