import java.io.*;
import java.util.*;

public class Histogram {
	public static void main(String args[]) throws IOException {
		
		//scanner object
		Scanner sf = new Scanner(new File("C:\\temp_Calvin\\Words.txt"));
		
		int maxIndx = -1;
		String text[] = new String[1000];
		while(sf.hasNext()) {
			maxIndx++;
			text[maxIndx] = sf.nextLine();
		}//fill text[]
		sf.close();
		
		Map<String, Integer> hist = new TreeMap<>();
		
		Scanner sc = new Scanner(text[0]);
		sc.useDelimiter(", ");
		while(sc.hasNext()) {	
			String key = sc.next();
			if (hist.containsKey(key)) {
				Integer count = hist.get(key);
				count++;
				hist.remove(key);
				hist.put(key, count);
			} else {
				hist.put(key, 1);
			}
		}//process text[]
		sc.close();
		Set<String> ks = hist.keySet();
		Iterator<String> iter = ks.iterator();
		
		System.out.printf("%-10s %10s", "Words", "Frequency");
		System.out.println("");
		while (iter.hasNext()) {
			String key = iter.next();
			String value = "";
			for (int i=0; i<hist.get(key); i++) {
				value += "*";
			}
			System.out.printf("%-10s %10s", key, value);
			System.out.println("");
		}
		
	}
}
