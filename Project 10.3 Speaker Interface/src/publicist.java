
public class publicist implements Speaker
{

	public void speak()
	{
		System.out.println("The publicist speaks about public incidents in politics.");
	}
	
	public void announce(String str)
	{
		System.out.println("The publicist said, \"" + str + "\"");
	}
	
}
