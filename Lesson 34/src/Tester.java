
public class Tester {
	public static void main (String args[]) {
		int a[][] = {{1,2,-2,0}, {-3,4,7,2}, {6,0,3,1}};
		int b[][] = {{-1,3}, {0,9}, {1,-11}, {4,-5}};
		
		int c[][] = MatrixMult.mult(a, b);
		
		for (int i=0; i<c.length; i++) {
			for (int o=0; o<c[0].length; o++) {
				System.out.print(c[i][o]);
				System.out.print("\t");
			}
			System.out.print("\n");
		}
	}
}
