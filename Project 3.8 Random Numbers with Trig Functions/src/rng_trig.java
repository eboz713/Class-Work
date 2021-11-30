//****************************************************************************************
//Random Trigonometry Functions.java                              Author: Erik Boswell
//
//Generates a random number from 20 to 40 and gives basic trigonometric results
//****************************************************************************************

import java.util.Random;

public class rng_trig
{

	public static void main(String[] args)
	{
		
		Random rng = new Random();
		
		int x = rng.nextInt(21) + 20;
		
		double sinx, cosx, tanx;
		
		sinx = Math.sin(x);
		
		cosx = Math.cos(x);
		
		tanx = Math.tan(x);
		
		System.out.println("Your lucky number today is " + x);
		System.out.println("The results are as follows:");
		System.out.println("sin x = " + sinx);
		System.out.println("cos x = " + cosx);
		System.out.println("tan x = " + tanx);
		

	}

}
