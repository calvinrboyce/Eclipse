import java.util.*;
import java.io.*;

public class StudentAverages_Out {
	public static void main(String args[]) throws IOException {
		Scanner sf = new Scanner(new File("C:\\temp_Calvin\\StudentScores.txt"));
		
		int maxIndx = -1;
		String text[] = new String[1000];
		
		while(sf.hasNext()) {
			maxIndx++;
			text[maxIndx] = sf.nextLine();
		}//fill text with input
		
		String names[] = new String[maxIndx + 1];
		int averages[] = new int[maxIndx + 1];
		
		for(int i=0; i<=maxIndx; i++) {
			Scanner sc = new Scanner(text[i]);
			names[i] = sc.next();
			
			int scoreTotal = 0;
			int scoreNum = 0;
			while(sc.hasNext()) {
				scoreTotal += sc.nextInt();
				scoreNum ++;
			}//compute averages
			double average = (((double)scoreTotal/(double)scoreNum) + 0.5);
			averages[i] = (int) average;
			
			sc.close();
		}//fill names array and averages array
		
		FileWriter fw = new FileWriter("C:\\temp_Calvin\\Output1.out");
		PrintWriter output = new PrintWriter(fw);
		
		for(int j=0; j<=maxIndx; j++) {
			output.println(names[j] + ", average = " + averages[j]);
		}//write names and averages to file
		
		
		output.close();
		fw.close();
		sf.close();
	}
}
