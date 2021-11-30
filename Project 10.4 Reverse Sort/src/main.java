//****************************************************************************************
//main.java                              Author: Erik Boswell
//
//Uses reverse sorting on a random set of integers from 0 to 50
//****************************************************************************************

import java.util.Random;

public class main
{

	public static void main(String[] args) 
	{
		
		int[] testSelection = new int[25];
		int[] testInsertion = new int[25];
		
		Random rng = new Random();
		
		for(int index = 0; index < testSelection.length - 1; index++)
		{
			testSelection[index] = rng.nextInt(50);
		}
		
		for(int index = 0; index < testInsertion.length - 1; index++)
		{
			testInsertion[index] = rng.nextInt(50);
		}
		
		System.out.println("Selection Sort Array\n");
		
		for(int index = 0; index < testSelection.length - 1; index++)
		{
			System.out.println(testSelection[index]);
		}
		
		Sorting sorts = new Sorting();
		
		sorts.selectionSort(testSelection);
		
		System.out.println("\n\nAfter Reverse Selection Sorting\n");
		
		for(int index = 0; index < testSelection.length - 1; index++)
		{
			System.out.println(testSelection[index]);
		}
		
		System.out.println("\n\nInsertion Sort Array\n");
		
		for(int index = 0; index < testInsertion.length - 1; index++)
		{
			System.out.println(testInsertion[index]);
		}
		
		sorts.insertionSort(testInsertion);
		
		System.out.println("\n\nAfter Reverse Insertion Sorting\n");
		
		for(int index = 0; index < testInsertion.length - 1; index++)
		{
			System.out.println(testInsertion[index]);
		}
		
	}
	
}
