import java.util.*;
public class MonteCarlo {
	double h = 0;
	double k = 0;
	double r = 0;
	Random rndm = new Random();
	public MonteCarlo(double x, double y, double z) {
		h = x;
		k = y;
		r = z;
	}
	
	public double nextRainDrop_x() {
		return (h-r) + 2*r * rndm.nextDouble();
	}
	
	public double nextRainDrop_y() {
		return (k-r) + 2*r * rndm.nextDouble();
	}
	
	public boolean insideCircle(double x, double y) {
		return ((Math.pow(x-h, 2) + Math.pow(y-k, 2)) <= Math.pow(r, 2));
	}
}
