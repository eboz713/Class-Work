import java.util.*;

public class isSatisfactory {
	
	boolean good = false;
	boolean fast = false;
	boolean cheap = false;
	
	public void setGoodTrue()
	{
		good = true;
	}
	
	public void setFastTrue()
	{
		fast = true;
	}
	
	public void setCheapTrue()
	{
		cheap = true;
	}
	
	public boolean satisfactoryCheck()
	{
	if ((good && fast) || (good && cheap) || (fast && cheap))
	{	
		return true;
	}
	
		return false;
	}
}
