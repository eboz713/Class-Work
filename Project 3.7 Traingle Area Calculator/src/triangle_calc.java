//****************************************************************************************
//Traingle Calculator.java                              Author: Erik Boswell
//
//Calculates the area of a triangle using threee side lengths
//****************************************************************************************

import java.util.Scanner;

import java.text.DecimalFormat;

public class triangle_calc
{

	public static void main(String[] args)
	{
		double a, b, c, s, area;
		
		Scanner scan = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("0.###");
		
		System.out.println("Write the length of the first side of the triangle:");
		
		a = scan.nextDouble();
		
		System.out.println("Write the length of the second side of the triangle:");
		
		b = scan.nextDouble();
		
		System.out.println("Write the length of the third side of the triangle:");
		
		c = scan.nextDouble();
		
		s = ( a + b + c ) / 2;
		
		area = Math.sqrt((s * (s - a) * (s - b) * (s - c)));
		
		System.out.println("The area of the triangle is " + df.format(area));
		

	}

}
