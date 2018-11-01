package problem2;

import java.util.ArrayList;

public class Court extends Main
{
	private ArrayList<Member> listOfMembers = new ArrayList<Member>();
	
	//Constructor Section
	public Court()
	{
		
	}
	//End Constructor Section	
		
	//Method Section
	
	//This function adds a new member to the list of members
	public void addMember()
	{
		listOfMembers.add(new Member(
				getUserString("Enter Member's First Name"),
				getUserString("Enter Member's Surname"),
				getUserString("Enter Member's Email"),
				getUserString("Enter Member's Telephone"),
				getUserInt("Enter Member's Number"),
				getUserString("Enter Member's Type")
				));
		
	}
	
	public void displayTimetable()
	{
		
	}
	
	//End Method Section
}
