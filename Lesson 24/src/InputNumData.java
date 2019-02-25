import java.io.*;
import java.util.*;
public class InputNumData {
	public static void main (String args[]) throws IOException {
		
		Scanner sf = new Scanner(new File("C:\\temp_Calvin\\NumData.txt"));
		int maxIndx = -1;
		String text[] = new String[1000];
		
		while (sf.hasNext()) {
			maxIndx++;
			text[maxIndx] = sf.nextLine();
			//System.out.println(text[maxIndx]);
		}
		sf.close();
		
		String answer = "";
		int sum;
		for (int j=0; j<=maxIndx; j++) {
			Scanner sc = new Scanner(text[j]);
			sum = 0;
			answer = "";
			boolean done = false;
			while (sc.hasNext()) {
				int i = sc.nextInt();
				if (!done) {
					answer = answer + i;
					done = true;
				} else {
					answer = answer + " + " + i;
				}
				sum = sum + i;
			}
			answer = answer + " = " +sum;
			System.out.println(answer);
			sc.close();
		}
	}
}
