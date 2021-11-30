//****************************************************************************************
//HMS to S.java                              Author: Erik Boswell
//
//Converts times from Hours Mins Secs to Secs
//****************************************************************************************

import java.util.Scanner;

public class HMS_to_S
{
	//------------------------------------------------------------------------------------
	//Converts times from Hours Mins Secs to Secs
	//------------------------------------------------------------------------------------

	public static void main(String[] args)
	{
		int hours, minutes, seconds, total_seconds;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of hours:");
		hours = scan.nextInt();
		
		System.out.println("Enter the number of minutes:");
		minutes = scan.nextInt();
		
		System.out.println("Enter the number of seconds:");
		seconds = scan.nextInt();
		
		total_seconds = (hours*3600) + (minutes*60) + seconds;
		
		System.out.println(hours + " hours " + minutes + " minutes " + seconds + 
				" seconds is equal to " + total_seconds + " seconds.");
		
	}

}
