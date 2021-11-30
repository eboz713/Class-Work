//****************************************************************************************
//Lights.java                              Author: Erik Boswell
//
//Turns on some bulbs
//****************************************************************************************
public class Lights
{
	
	public static void main(String[] args)
	{
		
		Bulb bulb1, bulb2, bulb3;
		
		bulb1 = new Bulb();
		bulb2 = new Bulb();
		bulb3 = new Bulb();
		
		bulb1.turnon();
		
		System.out.println("Bulb 1 is " + bulb1.status() + ", Bulb 2 is " + 
				bulb2.status() + ", and Bulb 3 is " + bulb3.status());
		
		bulb1.turnoff();
		
		System.out.println("Bulb 1 is " + bulb1.status() + ", Bulb 2 is " + 
				bulb2.status() + ", and Bulb 3 is " + bulb3.status());
		
		bulb2.turnon();
		
		System.out.println("Bulb 1 is " + bulb1.status() + ", Bulb 2 is " + 
				bulb2.status() + ", and Bulb 3 is " + bulb3.status());
		
		bulb2.turnoff();
		
		System.out.println("Bulb 1 is " + bulb1.status() + ", Bulb 2 is " + 
				bulb2.status() + ", and Bulb 3 is " + bulb3.status());
		
		bulb3.turnon();
		
		System.out.println("Bulb 1 is " + bulb1.status() + ", Bulb 2 is " + 
				bulb2.status() + ", and Bulb 3 is " + bulb3.status());
		
		bulb3.turnoff();
		
		System.out.println("Bulb 1 is " + bulb1.status() + ", Bulb 2 is " + 
				bulb2.status() + ", and Bulb 3 is " + bulb3.status());
		

	}

}
