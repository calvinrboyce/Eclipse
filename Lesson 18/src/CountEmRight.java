import java.util.*;
public class CountEmRight {
	public static void main (String[] args) {
		boolean done = false;
		Scanner kbReader = new Scanner(System.in);
		while (!done) {
			System.out.println("Type in a sentence and press ENTER. ");
			String sentence = kbReader.nextLine();
			sentence = sentence.toUpperCase();
			if (sentence.equals("EXIT")) {
				done = true;
			} else {
				sentence = sentence + "abc";
				String sp[] = sentence.split("S\\s*A");
				System.out.println("There are " + (sp.length - 1) + " occurrences");
			}
		}//while
		kbReader.close();
	}//main
}//CountEmRight
