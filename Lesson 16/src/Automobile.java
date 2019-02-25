
public class Automobile {
	public double mpg;
	public double gallons = 0;
	
	public Automobile (double milespergallon) {
		mpg = milespergallon;
	}
	
	public void fillUp(double gallons) {
		this.gallons = gallons;
	}
	
	public void takeTrip(double miles) {
		gallons -= miles/mpg;
	}
	
	public double reportFuel() {
		return gallons;
	}
}
