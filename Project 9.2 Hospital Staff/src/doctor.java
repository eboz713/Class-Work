
public class doctor extends employee

{

	protected String concentration;
	protected String action;
	
	public doctor(String Name, String Phone, String Address, String Social, String Concentration, String Action) 
	{
		super(Name, Phone, Address, Social);
		
		concentration = Concentration;
		action = Action;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Concentration: " + concentration);
		System.out.println(action);
		System.out.println("-----------------");
	}
	
	
}
