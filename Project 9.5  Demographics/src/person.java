
abstract public class person {

	protected String name;
	protected String age;
	protected String nationality;
	protected String occupation;
	protected String ethnicity;
	protected String gender;
	
	public person(String Name, String Age, String Nationality, String Occupation, String Ethnicity, String Gender)
	{
		name = Name;
		age = Age;
		nationality = Nationality;
		occupation = Occupation;
		ethnicity = Ethnicity;
		gender = Gender;
	}
	
	public void demoinfo()
	{
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Nationality: " + nationality);
		System.out.println("Occupation: " + occupation);
		System.out.println("Ethnicity: " + ethnicity);
		System.out.println("Gender: " + gender);
	}
	
}
