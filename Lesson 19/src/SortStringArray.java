import java.util.*;
public class SortStringArray {
	public static void main (String[] args) {
		String[] ss = {"Bill", "Mary", "Lee", "Agnes", "Alfred", "Thomas", "Alvin", "Bernard", "Ezra", "Herman"};
		Arrays.sort(ss);
		System.out.println("Ascending\tDescending");
		System.out.println("");
		for (int i=0; i<ss.length; i++) {
			System.out.println(ss[i]+"\t\t"+ss[ss.length-(i+1)]);
		}
	}
}
