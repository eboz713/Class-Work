//****************************************************************************************
//CourseListing.java                              Author: Erik Boswell
//
//Creates a course with students and test scores displayed via commands
//****************************************************************************************

public class CourseListing {

	public static void main(String[] args)
	{
		Address school = new Address("800 Lancaster Ave.", "Villanova",
                "PA", 19085);
		Address jHome = new Address("21 Jump Street", "Lynchburg",
               "VA", 24551);
		Student john = new Student("John", "Smith", jHome, school);

		Address mHome = new Address("123 Main Street", "Euclid", "OH",
               44132);
		Student marsha = new Student("Marsha", "Jones", mHome, school);
		
		Course math101 = new Course("Math 101");
		
		math101.addStudent(john);
		math101.addStudent(marsha);
		
		john.setTestScore(1, 77);
	    john.setTestScore(2, 83);
	    john.setTestScore(3, 81);
	    marsha.setTestScore(1, 85);
	    marsha.setTestScore(2, 82);
	    marsha.setTestScore(3, 91);
		
		System.out.println("The students enrolled in Math 101 are:");
		
		math101.roll();
		
		System.out.println("The average score in the Math 101 course is " + math101.average());
		
	}
}
