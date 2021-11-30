//****************************************************************************************
//RollingDice2.java                              Author: Erik Boswell
//
//Simulates rolling a pair of dice
//****************************************************************************************

public class RollingDice2
{
	
	public static void main (String[] args)
	{
		PairOfDice pair1 = new PairOfDice();
		
		pair1.roll();
		
		System.out.println("Die A rolled a " + pair1.get_faceValue_a());
		System.out.println("Die B rolled a " + pair1.get_faceValue_b());
		
		System.out.println("The sum of the two dice is " + pair1.roll_total());
		
		pair1.set_faceValue_a(1);
		pair1.set_faceValue_b(1);
		
		System.out.println("The dice are ready to roll again. Die A set to " + 
				pair1.get_faceValue_a() + ". Die B set to " + pair1.get_faceValue_b() + 
				".");
		
	}
}