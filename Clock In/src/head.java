import java.util.*;
//import java.io.*;
import org.joda.time.*;

public class head {
	public static void main (String args[]) {
		
		boolean done = false;
		Map<String, String> m = new TreeMap<>();
		Scanner kbReader = new Scanner(System.in);
		
		
		while (!done) {
			System.out.println("Please enter your name: ");
			LocalTime lt = new LocalTime();
			String input = kbReader.nextLine();
			Scanner cn = new Scanner(input);
			String first = cn.next();
			String second = cn.next();
			cn.close();
			if (!(first.equalsIgnoreCase("print"))) {
				m.put(input, (lt.getHourOfDay() + ":" + lt.getMinuteOfHour()));
			} else {
				Scanner ib = new Scanner(second);
				ib.useDelimiter(":");
				int hour = ib.nextInt();
				int minute = ib.nextInt();
				ib.close();
				Set<String> ks = m.keySet();
				Iterator<String> iter = ks.iterator();
				while (iter.hasNext()) {
					String name = iter.next();
					String time = m.get(name);
					Scanner sc = new Scanner(time);
					sc.useDelimiter(":");
					int cHour = sc.nextInt();
					int cMinute = sc.nextInt();
					
					if (cHour>=hour&&cMinute>=minute) {
						if (cMinute<10) {
							System.out.println(name + "\t\t" + cHour + ":0" + cMinute);
						} else {
							System.out.println(name + "\t\t" + time);
						}
					}
				sc.close();
				done = true;
				}
			}
			
			
		}
		kbReader.close();
	}
}




/* 
import java.text.*;
import java.util*;
Date date = new Date();
DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss a");
String s = dateFormat.format(date);
*/

