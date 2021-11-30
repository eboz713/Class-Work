//****************************************************************************************
//FlightTest.java                              Author: Erik Boswell
//
//Can browse through flight classes, set flight information, and get flight information
//****************************************************************************************

public class FlightTest 
{
	
	public static void main (String[] args)
	{
		Flight flight1 = new Flight ("Delta", 164893, 
				"Boston Logan International Airport", "Billund Airport");
		Flight flight2 = new Flight ("Air France", 392753, 
				"John F. Kemmedy International Airport", "Charles de Gaulle Airport");
		Flight flight3 = new Flight ("American Airlines", 429487, 
				"Dulles International Airport", "Brodley International Airport");
		Flight flight4 = new Flight ("Iceair", 739826, "Reykjavik Airport", 
				"Copenhagen Airport");
		
		System.out.println(flight1.get_Flight_num());
		flight1.set_Flight_num(164983);
		System.out.println("Revised to:");
		System.out.println(flight1.get_Flight_num());
		
		System.out.println();
		
		System.out.println(flight2.get_Origin());
		flight2.set_Origin("John F. Kennedy International Airport");
		System.out.println("Revised to:");
		System.out.println(flight2.get_Origin());
		
		System.out.println();
		
		System.out.println(flight3.get_Destination());
		flight3.set_Destination("Bradley International Airport");
		System.out.println("Revised to:");
		System.out.println(flight3.get_Destination());
		
		System.out.println();
		
		System.out.println(flight4.get_Airline());
		flight4.set_Airline("Icelandair");
		System.out.println("Revised to:");
		System.out.println(flight4.get_Airline());
		
		System.out.println();
		System.out.println();
		System.out.println(flight1);
		System.out.println();
		System.out.println(flight2);
		System.out.println();
		System.out.println(flight3);
		System.out.println();
		System.out.println(flight4);
		
	}
	

}