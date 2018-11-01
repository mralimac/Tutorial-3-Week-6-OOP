package problem1;

public class Menu extends Main
{
	//Attribute Section
	Unit unit1;
	//End Attribute Section
	
	//Constructor Section
	public Menu()
	{
		
	}
	//End Constructor Section
	
	//Method Section
	public void generateMenu()
	{
		System.out.println("Please select an option");
		System.out.println("1 - Add students");
		System.out.println("2 - Display all students");
		System.out.println("3 - Display specific student");
		System.out.println("4 - Display all passed students");
		System.out.println("5 - Display pass rate");
		System.out.println("6 - Remove student");
		int menuOption = getUserInt("");

		switch (menuOption)
		{
			case 1: unit1.addStudent(new Student(getUserInt("Enter the Student's ID Number"), getUserString("Enter the Students Forename"), getUserString("Enter the Students Surname"), getUserString("Enter the Students Email"), getUserString("Enter the Students Telephone Number")));
			//Adds a student
			break;
			
			case 2: unit1.getAllStudents();
			//Display all students
			break;
			
			case 3: unit1.getSingleStudent(getUserInt("Enter the Student's ID Number"));
			//Display specific student
			break;
			
			case 4: unit1.getAllPassedStudents();
			//Display all passed students
			break;
			
			case 5: unit1.getPassRate();
			//Display pass rate
			break;
			
			case 6: unit1.removeStudent(getUserInt("Enter the Student's ID Number"));
			//Remove student
			break;
		}
	}
	//End Method Section
}
