import java.io.*;
import java.util.*;
import java.text.*;
public class Gym {
	public static void main(String args[]) throws IOException {
		
		//number format object
		NumberFormat fmt = NumberFormat.getNumberInstance();
		fmt.setMinimumFractionDigits(3);
		fmt.setMaximumFractionDigits(3);
		
		//scanner object
		Scanner sf = new Scanner(new File("C:\\temp_Calvin\\DataGym.txt"));
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
			
			double comp[] = new double[10];
			double d;
			for(int i=0; i<10; i++) {
				d = sc.nextDouble();
				comp[i] = d;
			}//fill scores into comp[]
			
			Arrays.sort(comp);
			double sum = comp[1] + comp[2] + comp[3] + comp[4] + comp[5] + comp[6] + comp[7] + comp[8];
			double average = sum/8;
			
			System.out.printf("For Competitor #%d, the average is %.4f", j+1, average);
			System.out.println("");
			
			sc.close();
		}//process text[]
		
	}
}
