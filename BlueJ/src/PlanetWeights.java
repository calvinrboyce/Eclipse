import java.io.*;
import java.util.*;
public class PlanetWeights {
	public static void main(String args[])
	{
		//prompt weight
		System.out.println("What is your weight on earth?");
		Scanner kbReader = new Scanner(System.in);
		double weight = kbReader.nextDouble();
		//print menu
		System.out.println("1. Voltar");
		System.out.println("2. Krypton");
		System.out.println("3. Fertos");
		System.out.println("4. Servontos");
		//prompt selection
		System.out.println("Enter the number of your planet selection: ");
		boolean t = true;
		do
		{
			int choice = kbReader.nextInt();
			//switch return
			switch (choice)
			{
				case 1:
					weight *= 0.091;
					System.out.println("Your weight on Voltar would be " + weight);
					t = false;
					break;
				case 2:
					weight *= 0.720;
					System.out.println("Your weight on Krypton would be " + weight);
					t = false;
					break;
				case 3:
					weight *= 0.865;
					System.out.println("Your weight on Fertos would be " + weight);
					t = false;
					break;
				case 4:
					weight *= 4.612;
					System.out.println("Your weight on Servontos would be " + weight);
					t = false;
					break;
				default:
					System.out.println("Please enter 1, 2, 3, or 4");
			}
		} while (t);
	}
}
