public class Buffer {
	public static void main(String args[]) {
		String t1 = cat1(68,108);
		System.out.println(t1);
		
		String t2 = cat1(35,59);
		System.out.println(t2);
	}
	
	private static String cat(int start, int end) {
		String result = "";
		for (int i = start; i<=end; i++) {
			result = result + (char)i;
		}
		
		return result;
	}
	
	private static String cat1(int start, int end) {
		StringBuffer sb = new StringBuffer();
		for (int i = start; i<=end; i++) {
			sb.append((char)i);
		}
		
		return sb.toString();
	}
}