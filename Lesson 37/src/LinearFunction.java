
public class LinearFunction implements LinearFunctionMethods {
	double m;
	double b;
	
	public LinearFunction(double x, double y) {
		m = x;
		b = y;
	}
	
	public double getSlope() {
		return m;
	}
	
	public double getYintercept() {
		return b;
	}
	
	public double getRoot() {
		return -b/m;
	}
	
	public double getYvalue(double x) {
		return (m*x)+b;
	}
	
	public double getXvalue(double y) {
		return (y-b)/m;
	}
}
