//****************************************************************************************
//main.java                              Author: Erik Boswell
//
//Displays information fo various employees in a hospital
//****************************************************************************************

public class main 
{

	public static void main(String[] args)
	{
	
		doctor Doctor = new doctor("Steven Brown", "8735559860", "Skeet Rd", "032-86-1970", "Pediatrician", "The doctor is diagnosing the child patient");
		surgeon Surgeon = new surgeon("Tony Delaney", "8735559861", "Bedrow Rd", "032-84-1673", "Neurosurgeon", "The surgeon is performing brain surgery");
		janitor Janitor = new janitor("Rick Suarez", "8735559862", "Bleeker St", "028-31-9378", "The janitor is cleaning the floors");
		nurse Nurse = new nurse("Jennie Fitts", "8735559863", "Brooklane Rd", "035-21-0738", "The nurse is helping a patient");
		administrator Administrator = new administrator("Harold Franks", "8735559864", "Hill St", "031-47-1853", "The administrator is setting the daily schedule");
		receptionist Receptionist = new receptionist("Janet Hicks", "8735559865", "Fence Rd", "028-46-1864", "The receptionist is taking calls");
	
		Doctor.display();
		Surgeon.display();
		Janitor.display();
		Nurse.display();
		Administrator.display();
		Receptionist.display();
	
	}
}
