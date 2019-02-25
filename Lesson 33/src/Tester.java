
public class Tester {
	public static void main(String args[]) {
		PassingValues theObj = new PassingValues();
		theObj.gravy = 107.43;
		
		String s = "hello";
		
		int xray[] = {1, 2, 3, 4, 5};
		double floozy = 97.4;
		myMethod(floozy, theObj, xray,s);
		
		System.out.println(floozy);
		System.out.println(theObj.gravy);
		System.out.println(xray[2]);
		System.out.println(s);
	}
	
	public static void myMethod(double floozy, PassingValues anObj, int a[], String s) {
		floozy = 13.1;
		anObj.gravy = 10.0001;
		a[2] = 100;
		s = "good bye";
	}
}
