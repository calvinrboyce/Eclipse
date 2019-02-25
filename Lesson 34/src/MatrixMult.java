
public class MatrixMult {
	
	public static int[] [] mult (int a[] [], int b[] []) {
		int arows = a.length;
		int acolumns = a[0].length;
		int brows = b.length;
		int bcolumns = b[0].length;
		int sum[] [] = new int [arows] [bcolumns];
		
		if (acolumns == brows) {
			for (int r=0; r<arows; r++) {
				for (int c=0; c<bcolumns; c++) {
					int value = 0;
					for (int r1=0; r1<acolumns; r1++) {
						value += a[r] [r1]*b[r1] [c];
					}
					sum [r] [c] = value;
				} //sum columns
			} //sum rows
			return sum;
		} else {
			return sum;
		}
	} //mult
	
}
