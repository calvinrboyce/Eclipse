import java.io.*;
import java.util.*;


public class Lesson10 {
	public static void main (String args[]) {
		//print choices
		System.out.println("Make your arithmetic selection from the choices below:\n");
		System.out.println("Add");
		System.out.println("Subtract");
		System.out.println("Multiply");
		System.out.println("Divide");
		//prompt choice
		System.out.println("Your choice?");
		//set up scanner and fill choice variable
		Scanner kbReader = new Scanner(System.in);
		String choice = kbReader.nextLine();
		//prompt and fill operands
		System.out.print("\nEnter first operand.");
		double op1 = kbReader.nextDouble();
		System.out.println("\nEnter second operans.");
		double op2 = kbReader.nextDouble();
		
		System.out.println("");
		//evaluate with given operation
		switch (choice.toLowerCase()) {
			case "add":
				System.out.println(op1 + " plus " + op2 + " = " + (op1 + op2));
				break;
			case "subtract":
				System.out.println(op1 + " minus " + op2 + " = " + (op1 - op2));
				break;
			case "multiply":
				System.out.println(op1 + " times " + op2 + " = " + (op1 * op2));
				break;
			case "divide":
				System.out.println(op1 + " divided by " + op2 + " = " + (op1 / op2));
				break;
			default:
				System.out.println("Hey dummy, enter only \"addition\", \"subtraction\", \"multiplication\", or \"division\"!");
		}
		
	}
}