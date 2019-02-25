import java.util.*;
public class Tester {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a line in the following form: Ax + By + C = 0");
		
		System.out.print("Enter the \"A\" value for the line: ");
		DistToLine.A = kb.nextDouble();
		System.out.print("Enter the \"B\" value for the line: ");
		DistToLine.B = kb.nextDouble();
		System.out.print("Enter the \"C\" value for the line: ");
		DistToLine.C = kb.nextDouble();
		System.out.print("Enter the x coordinate for the point: ");
		double x = kb.nextDouble();
		System.out.print("Enter the y coordinate for the point: ");
		double y = kb.nextDouble();
		
		System.out.println("Distance from the point to the line is: " + DistToLine.getDist(x, y));
		
		kb.close();
	}
}
