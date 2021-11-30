//****************************************************************************************
//high_low.java                              Author: Erik Boswell
//
//Plays High Low guessing game
//****************************************************************************************

import java.util.Random;
import java.util.Scanner;

public class high_low {
	
	public static void main(String[] args)
	{
		int answer, guess;
		
		Random rng = new Random();
		
		Scanner scan = new Scanner(System.in);
		
		answer = rng.nextInt(100) + 1;
		
		System.out.println("Guess a number between 1 and 100:");
		
		guess = scan.nextInt();
		
		while(guess != answer)
		{
			if (guess < answer)
				System.out.println("Sorry, that guess is too low, try again.");
			if (guess > answer)
				System.out.println("Sorry, that guess is too high, try again.");
			
			guess = scan.nextInt();
		}
		
		if(guess == answer)
			System.out.println("Congratulations! That is the correct number.");
		
	}

}
