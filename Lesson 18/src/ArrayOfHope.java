
public class ArrayOfHope {
	public static void main (String[] args) {
		char alphabet[] = new char[26];
		for (int i=0; i<26; i++) {
			alphabet[i] = (char)(i+65);
		}
		for (int i=0; i<25; i++) {
			System.out.print(alphabet[i] + ", ");
		}
		System.out.print(alphabet[25]);
	}//main
}//ArrayOfHope
