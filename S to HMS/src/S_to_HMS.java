//****************************************************************************************
//S to HMS.java                              Author: Erik Boswell
//
//Converts times from Secs to Hours Mins Secs
//****************************************************************************************

import java.util.Scanner;

public class S_to_HMS
{

	public static void main(String[] args)
	{
		int hours, minutes, seconds, total_seconds;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of seconds:");
		total_seconds = scan.nextInt();
		
		seconds = total_seconds % 60;
		
		hours = total_seconds / 3600;
		
		minutes = (total_seconds / 60) % 60;
		
		System.out.println(total_seconds + " seconds is equal to " + hours + " hours " + 
				minutes + " minutes " + seconds + " seconds.");
		
	}

}
