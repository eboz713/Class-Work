
public class author implements Speaker
{

	public void speak()
	{
		System.out.println("The author speaks about books.");
	}
	
	public void announce(String str)
	{
		System.out.println("The author said, \"" + str + "\"");
	}
	
}
