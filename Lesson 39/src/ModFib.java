
public class ModFib {
	public static int modFibonacci(int x) {
		if (x == 0) {
			return 3;
		} else if (x == 1) {
			return 5;
		} else if (x == 2) {
			return 8;
		} else {
			return modFibonacci(x-1) + modFibonacci(x-2) + modFibonacci(x-3);
		}
	}
}
