
public class tester {
	public static void main (String args[]) {
		int cirCount = 0, sqrCount = 0;
		MonteCarlo mcObj = new MonteCarlo(5, 3, 2);
		
		for (int j=0; j<100000000; j++) {
			double x = mcObj.nextRainDrop_x();
			double y = mcObj.nextRainDrop_y();
			boolean insideCirle = mcObj.insideCircle(x, y);
			if(insideCirle) {
				cirCount++;
			}
			sqrCount++;
		}
		
		System.out.println(cirCount * Math.pow((2*mcObj.r), 2) / (sqrCount * Math.pow(mcObj.r, 2)));
	}
}
