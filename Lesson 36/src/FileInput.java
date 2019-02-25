import java.io.*;
import java.util.*;

public class FileInput {
	public static void readTheFile(String fileName) throws IOException {
		
		//scanner object
		Scanner sf = new Scanner(new File("C:\\temp_Calvin\\" + fileName));
		
		int maxIndx = -1;
		String text[] = new String[1000];
		while(sf.hasNext()) {
			maxIndx++;
			text[maxIndx] = sf.nextLine();
		}//fill text[]
		sf.close();
		
		//process text[]
		for(int j=0; j<=maxIndx; j++) {
			System.out.println(text[j]);
			
			
			
		}//process text[]
		
		
	}
}
