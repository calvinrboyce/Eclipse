import java.util.*;
public class RandomIntegers {
	public static void main (String args[]) {
		int r=0, count=0;
		Random rndm = new Random();
		for (int j=0; j<33; j++) {
			r = 71 + rndm.nextInt(28);
			System.out.print(r + " ");
			count++;
			if (count>14) {
				System.out.println("");
				count = 0;
			}
		}
		System.out.println("");
		double d=0;
		count = 0;
		for (int i=0; i<27; i++) {
			d = 99.78 + 47.44 * rndm.nextDouble();
			System.out.print(d + " ");
			count++;
			if (count>4) {
				System.out.println("");
				count = 0;
			}
			
		}
	}
}
