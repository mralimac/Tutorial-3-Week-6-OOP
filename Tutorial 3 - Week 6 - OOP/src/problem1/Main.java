package problem1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	//Attribute Section
	private Scanner inputScanner = new Scanner(System.in);
	//End Attribute Section
	
	//Method Section
	public static void main(String[] args) {
		Unit unit1 = new Unit("H123 D34", "Object Oriented Programming");
	}
	
	public String getUserString(String displayString)
	{
		if(!displayString.equals(null))
		{
			System.out.println(displayString);
		}
		
		return inputScanner.next();
	}
	
	public int getUserInt(String displayString)
	{
		if(!displayString.equals(null))
		{
			System.out.println(displayString);
		}
		
		while(true)
		{
			try
			{
				return inputScanner.nextInt();	
			}
			catch(InputMismatchException e)
			{
				System.out.println("Incorrect Input");
			}
			
		}		
	}
	//End Method Section
}
