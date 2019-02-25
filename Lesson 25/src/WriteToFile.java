import java.io.*;
public class WriteToFile
{
	public static void main(String args[]) throws IOException
	{
		FileWriter fw = new FileWriter("C:\\temp_Calvin\\Output1.out");
		PrintWriter output = new PrintWriter(fw);
		
		output.print("Four-score and ");
		double d = 7.023;
		output.println(d);
		output.println("years ago.");

		output.close( ); //These two lines are very important. Some of the data
		fw.close( ); //may not actually be put on disk until you close.
}
}