
public class FirstFactorial {
	public static int firstFactorial(int num) {
		if(num==0) {
			return 1;
		} else {
			return num*firstFactorial(num-1);
		}
	}


public static void main(String args[]) {
	System.out.println(FirstFactorial.firstFactorial(16));
}}