
import java.util.Scanner;

public class Crypto {
	String sentence;
	
/*	public String encrypt (String str) {
		String x = str;
		x = x.replace("v", "ag',r");
		x = x.replace("V", "ag',r");
		x = x.replace("m", "ssad");
		x = x.replace("M", "ssad");
		x = x.replace("g", "jeb..w");
		x = x.replace("G", "jeb..w");
		x = x.replace("b", "dug>?/");
		x = x.replace("B", "dug>?/");
		return x;
	} */
	
	public String encrypt(String str) {
		Scanner sc = new Scanner(str);
		sc.useDelimiter("");
		String encrypted = "";
		while (sc.hasNext()) {
			String next = sc.next();
			if (next.equals("v")||next.equals("V")) {
				encrypted = encrypted + "ag',r";
			} else if (next.equals("m")||next.equals("M")) {
				encrypted = encrypted + "ssad";
			} else if (next.equals("g")||next.equals("G")) {
				encrypted = encrypted + "jeb..w";
			} else if (next.equals("b")||next.equals("B")) {
				encrypted = encrypted + "dug>?/";
			} else {
				encrypted = encrypted + next;
			}
		}
		return encrypted; //This is a ag',rery dug>?/ijeb..w ssadorninjeb..w.
	} //encrypt()
	
	public String decrypt (String strn) {
		String thing = strn;
		thing = thing.replace("ag',r", "v");
		thing = thing.replace("ssad",  "m");
		thing = thing.replace("jeb..w", "g");
		thing = thing.replace("dug>?/", "b");
		return thing;
	}
	
/*	public String decrypt(String strn) {
		Scanner cn = new Scanner(strn);
		cn.useDelimiter("");
		String decrypted = "";
		while (cn.hasNext()) {
			String next = cn.next();
			if (next.equals("ag',r")) {
				decrypted = decrypted + "v";
			} else if (next.equals("ssad")) {
				decrypted = decrypted + "m";
			} else if (next.equals("jeb..w")) {
				decrypted = decrypted + "G";
			} else if (next.equals("dug>?/")) {
				decrypted = decrypted + "b";
			} else {
				decrypted = decrypted + next;
			}
		}
		return decrypted;
		
	} //decrypt() */
	
} //class crypto