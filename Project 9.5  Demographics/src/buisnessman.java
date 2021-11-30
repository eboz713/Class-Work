
public class buisnessman extends person
{

	protected String company;
	protected String position;
	
	public buisnessman(String Name, String Age, String Nationality, String Occupation, String Ethnicity, String Gender, String Company, String Position)
	{
		super(Name, Age, Nationality, Occupation, Ethnicity, Gender);
		company = Company;
		position = Position;
	}
	
	public void demoinfo()
	{
		super.demoinfo();
		System.out.println("Company: " + company);
		System.out.println("Position: " + position);
		System.out.println("-----------------------");
	}
	
}
