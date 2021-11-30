
public class policeofficer extends person
{

	protected String badgenumber;
	protected String precinct;
	
	public policeofficer(String Name, String Age, String Nationality, String Occupation, String Ethnicity, String Gender, String BadgeNumber, String Precinct)
	{
		super(Name, Age, Nationality, Occupation, Ethnicity, Gender);
		badgenumber = BadgeNumber;
		precinct = Precinct;
	}
	
	public void demoinfo()
	{
		super.demoinfo();
		System.out.println("Badge Number: " + badgenumber);
		System.out.println("Precinct: " + precinct);
		System.out.println("-----------------------");
	}
	
}
