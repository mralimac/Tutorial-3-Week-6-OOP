package problem2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{

	Scanner inputScanner = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		

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
	
	

}
