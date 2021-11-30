//****************************************************************************************
//Flight.java                              Author: Erik Boswell
//
//Sets data for flights in FlightTest andretrieves data for flights in FlightTest
//****************************************************************************************

public class Flight 
{
	
	private String airline;
	private int flight_num;
	private String origin;
	private String destination;
	
	public Flight (String Airline, int Flight_num, String Origin, String Destination)
	{
		airline = Airline;
		flight_num = Flight_num;
		origin = Origin;
		destination = Destination;
	}
	
	//************************************************************************************
	//Set of commands for revising individual information on flights
	//************************************************************************************
	
	public void set_Airline(String Airline_Revision)
	{
		airline = Airline_Revision;
	}

	public void set_Flight_num(int Flight_num_Revision)
	{
		flight_num = Flight_num_Revision;
	}
	
	public void set_Origin(String Origin_Revision)
	{
		origin = Origin_Revision;
	}
	
	public void set_Destination(String Destination_Revision)
	{
		destination = Destination_Revision;
	}
	
	//************************************************************************************
	//Set of commands for retrieving individual information from books
	//************************************************************************************
	
	public String get_Airline()
	{
		return "Flight number " + flight_num + " is with " + airline;
	}
	
	public int get_Flight_num()
	{
		return flight_num;
	}
	
	public String get_Origin()
	{
		return "Flight number " + flight_num + " takes off from " + origin;
	}
	
	public String get_Destination()
	{
		return "Flight number " + flight_num + " lands at " + destination;
	}
	
	//************************************************************************************
	//Command to return all book information
	//************************************************************************************
	
	public String toString()
	{
		return "Flight number " + flight_num + " with " + airline + " departs from " + 
				origin + " and lands at " + destination;
	}
	
}