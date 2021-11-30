//********************************************************************
//  Student.java       Author: Lewis/Loftus    Edited: Erik Boswell
//
//  Represents a college student, edited to include test scores
//********************************************************************

public class Student
{
   private String firstName, lastName, name;
   private Address homeAddress, schoolAddress;
   private int test1, test2, test3, avg;

   
   
   //-----------------------------------------------------------------
   //  Constructor: Sets up this student with the specified values.
   //-----------------------------------------------------------------
   public Student(String first, String last, Address home,
           Address school)
   {
	   	firstName = first;
	   	lastName = last;
	   	homeAddress = home;
		schoolAddress = school;
   }
   
   public Student(String first, String last, Address home,
                   Address school, int test1, int test2, int test3)
   {
      firstName = first;
      lastName = last;
      homeAddress = home;
      schoolAddress = school;
      this.test1 = test1;
      this.test2 = test2;
      this.test3 = test3;
   }
   
   public String getName(Student student)
   {
	   String name = student.firstName;
	   return name;
   }
   
   public void setTestScore(int testnum, int score)
   {
	   if (testnum == 1)
		   test1 = score;
	   if (testnum == 2)
		   test2 = score;
	   if (testnum == 3)
		   test3 = score;
   }
   
   public int getTestScore(int testnum)
   {
	   if (testnum == 1)
		   return test1;
	   if (testnum == 2)
		   return test2;
	   if (testnum == 3)
		   return test3;
	   else
		   return 0;
   }
   
   public int average()
   {
	   avg = (test1 + test2 + test3) / 3;
	   return avg;
   }
   
   //-----------------------------------------------------------------
   //  Returns a string description of this Student object.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result;

      result = firstName + " " + lastName + "\n";
      result += "Home Address:\n" + homeAddress + "\n";
      result += "School Address:\n" + schoolAddress + "\n";
      result += "Test 1: " + test1 + "\n";
      result += "Test 2: " + test2 + "\n";
      result += "Test 3: " + test3 + "\n";
      result += "Average Score: " + average();

      return result;
   }
}
