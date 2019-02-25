import java.io.*;
import java.util.*;

public class TelemetryData {
	public static void main(String args[]) throws IOException {
		
		//scanner object
		Scanner sf = new Scanner(new File("C:\\temp_Calvin\\Switches.txt"));
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
			
			int s = sc.nextInt();
			
			System.out.println("Switch status for data value " + s + ":");
			for(int i=0; i<8; i++) {
				if (((s)&(int)(Math.pow(2, i))) == 0) {
					System.out.println("Switch sw" + (i+1) + " is \"off\"");
				} else {
					System.out.println("Switch sw" + (i+1) + " is \"on\"");
				}
			}
			
			
			sc.close();
		}//process text[]
		
		
	}
}
