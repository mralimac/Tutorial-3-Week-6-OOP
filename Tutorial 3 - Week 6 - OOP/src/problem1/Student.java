package problem1;

public class Student
{
	//Attribute Section
	private String result;
	private int studentID;
	private String studentForename;
	private String studentSurname;
	private String studentEmail;
	private String studentMobileNum;
	//End Attribute Section
	
	//Constructor Section
	public Student(int studentID, String studentForename, String studentSurname, String studentEmail, String studentMobileNum)
	{
		
		this.studentID = studentID;
		this.studentForename = studentForename;
		this.studentSurname = studentSurname;
		this.studentEmail = studentEmail;
		this.studentMobileNum = studentMobileNum;
		this.result = "U";
	}
	//End Constructor Section
	
	//Method Section
	public void setResult(String result)
	{
		this.result = result;
	}
	
	public String getResult()
	{
		return this.result;
	}
	
	public int getStudentID()
	{
		return this.studentID;
	}
	
	public void getAllDetails()
	{
		System.out.println("Student Name: " + this.studentForename + " " + this.studentSurname);
		System.out.println("Student Email: "+this.studentEmail);
		System.out.println("Student Mobile Num: " + this.studentMobileNum);
	}
	//End Method Section
}
