import java.io.*;
import java.util.*;

public class Final {
	public static void main(String args[]) throws IOException {
		
		//scanner object
		Scanner sf = new Scanner(new File("C:\\temp_Calvin\\StudentData.txt"));
		
		int maxIndx = -1;
		String text[] = new String[1000];
		while(sf.hasNext()) {
			maxIndx++;
			text[maxIndx] = sf.nextLine();
		}//fill text[]
		sf.close();
		
		
		Scanner cb = new Scanner(text[0]);
		int numGrade = cb.nextInt();
		cb.close();
		
		Set<String> grades = new TreeSet<>();

		for(int j=1; j<=maxIndx; j++) {
			Scanner sc = new Scanner(text[j]);
			Scanner cn = new Scanner(text[j]);
			if (j<numGrade+1) {
				sc.next();
				sc.next();
				if (sc.nextInt()>88) {
					grades.add(cn.next());
				} else {
					grades.remove(cn.next());
				}
			} else {
				grades.remove(cn.next());
			}
			cn.close();
			sc.close();
		}//process text[]
		
		Iterator<String> itr = grades.iterator();
		
		for (int i=0; i<grades.size(); i++) {
			System.out.println(itr.next());
		}
		
		
		
	}
}
