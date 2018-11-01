package problem1;

import java.util.ArrayList;

public class Unit 
{
	//Attribute Section
	private String unitNumber;
	private String unitTitle;
	private ArrayList<Student> classList = new ArrayList<Student>();
	//End Attribute Section

	//Constructor Section
	public Unit(String unos, String utitle)
		{
		unitNumber = unos;
		unitTitle = utitle;
		}
	//End Constructor Section
	
	//Method Section
	
	//Adds a student to the classList
	public void addStudent(Student temp)
	{
		boolean space = false;
		for (int x=0; x<classList.size();x++)
		{
			if (classList.get(x)==null)
			{
				classList.set(x, temp);
				space = true;
				break;
			}
		}
	if (space==true) System.out.println("Student inserted"); else System.out.println("No space avaliable");
	}
	
	//This function gets a single student using the Student ID as a reference
	public void getSingleStudent(int studentID)
	{		
		for(int i =0; i<classList.size(); i++)
		{
			if(classList.get(i).getStudentID() == studentID)
			{				
				classList.get(i).getAllDetails();
			}
		}		
	}
	
	//This function gets all the students in the classlist
	public void getAllStudents()
	{
		System.out.println("***************************************");
		for(int i = 0; i<classList.size(); i++)
		{
			classList.get(i).getAllDetails();
			System.out.println("***************************************");
		}
	}
	
	//This function gets all the students that have "P" in their Result attribute
	public void getAllPassedStudents()
	{
		System.out.println("***************************************");
		for(int i = 0; i<classList.size(); i++)
		{
			if(classList.get(i).getResult().equalsIgnoreCase("p"))
			{
				classList.get(i).getAllDetails();
				System.out.println("***************************************");
			}			
		}
	}
	
	//Gets the passrate of all the students and presents it as a percentage
	public void getPassRate()
	{
		int numOfPassStudents = 0;
		for(int i = 0; i<classList.size(); i++)
		{
			if(classList.get(i).getResult().equalsIgnoreCase("p"))
			{
				numOfPassStudents++;				
			}			
		}
		int percentRate = (numOfPassStudents/classList.size()) * 100;
		System.out.println("Pass rate: "+ percentRate);
	}
	
	//This function removes a student from the classlist using the Student ID as a reference
	public void removeStudent(int studentID)
	{
		for(int i =0; i<classList.size(); i++)
		{
			if(classList.get(i).getStudentID() == studentID)
			{
				classList.remove(i);
			}
		}
		
	}
	
	//End Method Section
}
