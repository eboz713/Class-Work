
public class preacher implements Speaker
{

	public void speak()
	{
		System.out.println("The preacher speaks about morals.");
	}
	
	public void announce(String str)
	{
		System.out.println("The preacher said, \"" + str + "\"");
	}
	
}
