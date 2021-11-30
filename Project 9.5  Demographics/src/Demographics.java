//****************************************************************************************
//Demographics.java                              Author: Erik Boswell
//
//Displays demographic information based on various occupations
//****************************************************************************************


public class Demographics {

	public static void main(String[] args)
	{
		
		policeofficer PoliceofficerA = new policeofficer("Jerry Ketter", "25", "American", "Police Officer", "White", "Male", "20573", "53rd");
		policeofficer PoliceofficerB = new policeofficer("Linda Sloane", "33", "Mexican", "Police Officer", "Hispanic", "Female", "13540", "101st");
		buisnessman BuisnessmanA = new buisnessman("Bill Nieder", "39", "American", "Buisnessman", "White", "Male", "Berns Plastics", "COO");
		buisnessman BuisnessmanB = new buisnessman("Francine Meyer", "27", "American", "Buisnessman", "White", "Female", "Goldman Conglomerate", "Executive Officer");
		doctor DoctorA = new doctor("David Johnson", "32", "Canadian", "Doctor", "White", "Male", "Clinical");
		doctor DoctorB = new doctor("Wanda Dreyfus", "28", "Austrian", "Doctor", "White", "Female", "Pediatrician");
		
		System.out.println("Police Officer Demogrpahics\n");
		PoliceofficerA.demoinfo();
		PoliceofficerB.demoinfo();
		System.out.println("\nBuisnessman Demographics\n");
		BuisnessmanA.demoinfo();
		BuisnessmanB.demoinfo();
		System.out.println("\nDoctor Demographics\n");
		DoctorA.demoinfo();
		DoctorB.demoinfo();
		
	}
	
}
