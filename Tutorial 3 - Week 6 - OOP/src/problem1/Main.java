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
		unit1.generateMenu();
	}
	
	//This function returns the user inputted string
	public String getUserString(String displayString)
	{
		if(!displayString.equals(null))
		{
			System.out.println(displayString);
		}
		
		return inputScanner.next();
	}
	
	//This method checks and returns the user inputted int
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
