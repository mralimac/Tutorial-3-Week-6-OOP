package problem2;

public class Member extends Person
{
	//Attributes Section	
	private int memberNumber;
	private String memberType;
	
	//End Attributes Section
	
	//Constructor Section
	public Member(String forename, String surname, String personEmail, String personTelephone, int memberNumber, String memberType)
	{
		super(forename, surname, personEmail, personTelephone);
		this.memberNumber = memberNumber;
		this.memberType = memberType;
	}
	//End Constructor Section
	
	//Method Section
	//End Method Section
}
