
public class BasicallySpeaking {
	public static void main (String[] args) {
		System.out.println("Decimal\t\tBinary\t\tOctal\tHex\tCharacter");
		for (int x=65; x<=90; x++) {
			System.out.println(x+"\t\t"+Integer.toBinaryString(x)+"\t\t"+Integer.toOctalString(x)+"\t"+Integer.toHexString(x)+"\t"+(char)x);
		}
	}
}
