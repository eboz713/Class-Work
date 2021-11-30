//****************************************************************************************
//Random Cylinder Generator.java                              Author: Erik Boswell
//
//Generates two random numbers to function as dimensions of a cylinder when calculating
//volume and surface area
//****************************************************************************************

import java.util.Random;

public class rng_cylinder
{

	public static void main(String[] args)
	{
		Random rng = new Random();
		
		int r = rng.nextInt(20) + 1;
		
		int h = rng.nextInt(20) + 1;
		
		double volume, surface_area;
		
		volume = Math.PI * Math.pow(r,  2) * h;
		
		surface_area = 2 * Math.PI * r * h;
		
		System.out.println("Your generated radius is " + r + 
				", and your generated height is " + h + ".");
		System.out.println("This results in a volume of " + volume + 
				" and a surface area of " + surface_area + ".");
		
		
	}

}
