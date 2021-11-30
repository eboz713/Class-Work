//****************************************************************************************
//D to B and C.java                              Author: Erik Boswell
//
//Converts dollar values to bills and coins
//****************************************************************************************

import java.util.Scanner;

public class d_to_b_and_c
{

	public static void main(String[] args)
	{
		float penniesf, nickelsf, dimesf, quartersf, dollars;
		
		int pennies, nickels, dimes, quarters, dollar1, dollar5, dollar10;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the dollar amount of money you have:");
		dollars = scan.nextFloat();
		
		dollar10 = (int) dollars / 10;
		
		dollar5 = (int) (dollars - dollar10 * 10) / 5;
		
		dollar1 = (int) (dollars - dollar10 * 10 - dollar5 * 5) / 1;
		
		quartersf = (int) (100 * (dollars - dollar10 * 10 - dollar5 * 5 - dollar1 * 1) 
				/ 25);
		
		dimesf = (int) (100 * (dollars - dollar10 * 10 - dollar5 * 5 - dollar1 * 1 
				- quartersf * 0.25f) / 10);
		
		nickelsf = (int) (100 * (dollars - dollar10 * 10 - dollar5 * 5 - dollar1 * 1 
				- quartersf * 0.25f - dimesf * 0.1f) / 5);
		
		penniesf = (int) (100 * (dollars - dollar10 * 10 - dollar5 * 5 - dollar1 * 1 
				- quartersf * 0.25f - dimesf * 0.1f - nickelsf * 0.05f));
		
		quarters = (int) quartersf;
		
		dimes = (int) dimesf;
		
		nickels = (int) nickelsf;
		
		pennies = (int) penniesf;
		
		System.out.println("This comes out to");
		System.out.println(dollar10 + " 10 dollar bills");
		System.out.println(dollar5 + " 5 dollar bills");
		System.out.println(dollar1 + " 1 dollar bills");
		System.out.println(quarters + " quarters");
		System.out.println(dimes + " dimes");
		System.out.println(nickels + " nickels");
		System.out.println(pennies + " pennies");

		
	}

}
