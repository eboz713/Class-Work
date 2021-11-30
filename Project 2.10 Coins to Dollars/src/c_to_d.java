//****************************************************************************************
//C to D.java                              Author: Erik Boswell
//
//Converts coin values to dollars
//****************************************************************************************

import java.util.Scanner;

public class c_to_d
{

	public static void main(String[] args)
	{
		float pennies, nickels, dimes, quarters, dollars;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of pennies:");
		pennies = scan.nextInt();
		
		System.out.println("Enter the number of nickels:");
		nickels = scan.nextInt();
		
		System.out.println("Enter the number of dimes:");
		dimes = scan.nextInt();
		
		System.out.println("Enter the number of quarters:");
		quarters = scan.nextInt();
		
		dollars = pennies * 0.01f + nickels * 0.05f + dimes * 0.1f + quarters * 0.25f;
		
		System.out.println("These coins are valued at $" + dollars);
		
		
		
	}

}
