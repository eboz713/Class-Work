//****************************************************************************************
//histogram.java                              Author: Erik Boswell
//
//Displays a histogram of numbers entered into a list
//****************************************************************************************

import java.util.Scanner;

public class histogram 
{

	public static void main(String[] args)
	{

		Scanner scan = new Scanner(System.in);
		
		int[] list = new int[10];
		
		System.out.println("Please enter numbers from 1 to 100. Any number outside this"+
			" range will cut off number entry.");
		
		int value = scan.nextInt();
		
		while(value >= 1 && value <= 100)
		{
			
			list[(value - 1)/10] = list[(value - 1)/10] + 1;
			System.out.println("Enter another value from 1 to 100");
			value = scan.nextInt();
					
		}
		
		System.out.println("Histogram below\n\n");
		
		for(int check = 0; check < list.length; check++)
		{
			System.out.print(check * 10 + 1 + "-" + (check + 1) * 10 + "\t|");
				
			for(int stars = 0; stars < list[check]; stars++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	
	}
	
}
