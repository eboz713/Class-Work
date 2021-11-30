//****************************************************************************************
//BoxCarCount.java                              Author: Erik Boswell
//
//Rolls a pair of dice 1000 times and counts the number of box cars
//****************************************************************************************

public class BoxCarCount
{
	
	public static void main (String[] args)
	{
		int total = 0;
		
		int count = 0;
		
		PairOfDice pair1 = new PairOfDice();
		
		do
		{
			pair1.roll();
			if(pair1.roll_total() == 6)
				total ++;
			
			count ++;
		}
		while(count < 1000);
		
		System.out.println("Of 1000 rolls, a box car was rolled " + total + " times.");
	}
}