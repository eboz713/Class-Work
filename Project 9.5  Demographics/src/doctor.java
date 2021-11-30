
public class doctor extends person
{

	protected String practice;
	
	public doctor(String Name, String Age, String Nationality, String Occupation, String Ethnicity, String Gender, String Practice)
	{
		super(Name, Age, Nationality, Occupation, Ethnicity, Gender);
		practice = Practice;
	}
	
	public void demoinfo()
	{
		super.demoinfo();
		System.out.println("Practice: " + practice);
		System.out.println("-----------------------");
	}
	
}
