import java.io.*;
import java.util.*;

public class CodeTalker {
	public static void main(String args[]) throws IOException {
		
		//scanner object
		Scanner sf = new Scanner(new File("C:\\temp_Calvin\\Data.txt"));
		
		int maxIndx = -1;
		String text[] = new String[1000];
		while(sf.hasNext()) {
			maxIndx++;
			text[maxIndx] = sf.nextLine();
		}//fill text[]
		sf.close();
		
		
		Map<String, String>dictionary = new HashMap<>();
		//process text[]
		for(int j=1; j<=maxIndx-1; j++) {
			Scanner sc = new Scanner(text[j]);
			sc.useDelimiter("=");
			String key = sc.next();
			String value = sc.next();
			dictionary.put(key, value);
			sc.close();
		}//process text[]
		
		Scanner sc = new Scanner(text[maxIndx]);
		Scanner cn = new Scanner(text[maxIndx]);
		while (sc.hasNext()) {
			if(dictionary.containsKey(sc.next())) {
				System.out.print(dictionary.get(cn.next()) + " ");
			} else {
				System.out.print(cn.next() + " ");
			}
		}
		sc.close();
		cn.close();
		
	}
}
