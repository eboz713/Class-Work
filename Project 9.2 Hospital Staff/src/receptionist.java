
public class receptionist extends employee

{

	protected String action;
	
	public receptionist(String Name, String Phone, String Address, String Social, String Action) 
	{
		super(Name, Phone, Address, Social);
	
		action = Action;
		}
		
	public void display()
	{
		super.display();
		System.out.println(action);
		System.out.println("-----------------");
	}
	
}
