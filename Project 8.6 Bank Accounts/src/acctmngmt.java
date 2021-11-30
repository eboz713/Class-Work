//****************************************************************************************
//acctmngmt.java                              Author: Erik Boswell
//
//Sets up an array for managing 30 bank accounts based on the chapter 4 Account class
//****************************************************************************************

import java.util.Scanner;

public class acctmngmt {
	
	private static Account[] accounts = new Account[30];
	
	private static int acctArrayIndex = 0;
	
	public static void main(String[] args)
	{
		int accountNumber;
		double balance;
		String name;
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Please enter an account number or 0 to quit:");
		
		int acctNum = scan.nextInt();
		
		while(acctNum != 0)
		{
			accountNumber = acctNum;
			System.out.println("Enter the account holder's name:");
			name = scan.next();
			do
			{
				System.out.println("Please enter the starting balance of this account:");
				balance = scan.nextDouble();
				if(balance < 0)
					error();
			}while(balance < 0);
			
			accounts[acctArrayIndex] = new Account(name, accountNumber, balance);
			
			System.out.println("Your account has been formed.");
			System.out.println("Would you like to make a deposit or withdrawal?");
			System.out.println("Enter 1 for deposit and 2 for withdrawal:");
			
			int value = scan.nextInt();
			
			if(value == 1)
			{
				double depositVal;
				
				do
				{
					System.out.println("Enter the amount you wish to deposit:");
					depositVal = scan.nextDouble();
					if(depositVal < 0)
						error();
				}while(depositVal < 0);
				
				accounts[acctArrayIndex].deposit(depositVal);
			}
			
			if(value == 2)
			{
				double withdrawVal;
				
				do
				{
					System.out.println("Please note that there is a $2.00 fee for" 
							+ "withdrawals.");
					System.out.println("Enter the amount you wish to withdraw:");
					withdrawVal = scan.nextDouble();
					if(withdrawVal < 0)
						error();
				}while(withdrawVal < 0);
				
				accounts[acctArrayIndex].withdraw(withdrawVal, 2.00);
			}
			
			acctArrayIndex++;
			
			System.out.println("Please enter an account number or 0 to quit:");
			
			acctNum = scan.nextInt();
		}
		
		System.out.println("Accounts management completed, displaying all active"
				+ " accounts.");
		System.out.println();
		
		displayAccounts();
		
		System.out.println("Enter 1 to apply interest. Enter any other value to "
				+ "terminate this program.");
		
		int interest = scan.nextInt();
		
		if(interest == 1)
			addInterestAll();
		
		if(interest == 1)
			displayAccounts();
		
		System.out.println("Have a nice day!");
		
	}
	
	public static void error()
	{
		System.out.println("Cannot process negative values, please try again.");
	}
	
	public static void displayAccounts()
	{
		for(int index = 0; index < acctArrayIndex; index++)
		{
			System.out.println(accounts[index].toString());
		}
	}
	
	public static void addInterestAll()
	{
		for(int index = 0; index < acctArrayIndex; index++)
		{
			accounts[index].addInterest();
		}
	}

}
