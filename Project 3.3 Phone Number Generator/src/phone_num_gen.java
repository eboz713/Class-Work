//****************************************************************************************
//Phone Number Generator.java                              Author: Erik Boswell
//
//Generates a phone number where the area code does not contain an 8 or a 9 and the first
//three digits are less than 655
//****************************************************************************************

import java.util.Random;
import java.text.DecimalFormat;

public class phone_num_gen
{

	public static void main(String[] args)
	{
		int area1, area2, area3, main1234567;
		
		Random rng = new Random();
		
		DecimalFormat df = new DecimalFormat("0000000");
		
		area1 = rng.nextInt(8);
		area2 = rng.nextInt(8);
		area3 = rng.nextInt(8);
		
		main1234567 = rng.nextInt(6550000);
		
		String main_number = df.format(main1234567);
		
		String main_number123 = main_number.substring(0, 3);
															
		String main_number4567 = main_number.substring(3, 7);
		
		System.out.println("Welcome! You're newly registered phone number is (" + area1 
				+ area2 + area3 + ")" + main_number123 + "-" + main_number4567);

	}
}
