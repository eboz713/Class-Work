//****************************************************************************************
//NumberStats.java                              Author: Erik Boswell
//
//Displays how many of certain numbers are entered into a list
//****************************************************************************************

import java.util.Scanner;

public class NumberStats
{
	
	public static void main(String[] args)
	{

		Scanner scan = new Scanner(System.in);
		
		int[] list = new int[51];
		
		System.out.println("Please enter numbers from -25 to 25. Any number outside this"+
			" range will cut off number entry.");
		
		int value = scan.nextInt();
		
		while(value + 25 >= 0 && value + 25 <= 50)
		{
			
			list[value + 25] = list[value + 25] + 1;
			System.out.println("Enter another value from -25 to 25");
			value = scan.nextInt();
					
		}
		
		System.out.println("The numbers with occurences are:");
		
		for(int check = 0; check < list.length; check++)
		{
			if(list[check] > 0)
			{
				System.out.println(check - 25 + ": \t" + list[check]);
			}
		}
	
	}
}