//****************************************************************************************
//CountFlips.java                              Author: Erik Boswell
//
//Counts the numbers of heads and tails when flipping a coin 100 times
//****************************************************************************************

public class CountFlips
{
	
	public static void main (String[] args)
	{
		int hcount = 0;
		int tcount = 0;
		int count = 0;
		
		Coin coin = new Coin();
		
		do
		{
			coin.flip();
			
			if(coin.isHeads())
				hcount ++;
			else
				tcount ++;
			
			count ++;
		}
		while(count < 100);
		
		System.out.println("Of 100 flips, " + hcount + " were heads and " + tcount + 
				" were tails.");
	}
	
}