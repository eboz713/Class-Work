//****************************************************************************************
//ToDoList.java                              Author: Erik Boswell
//
//Sets a list of tasks with priority levels and prints out details of said tasks
//****************************************************************************************

public class ToDoList
{	
	public static void main(String[] args)
	{
	
	Task t1, t2, t3, t4, t5;
	
	t1 = new Task("Vaccuum", "Vaccuum the house", "Vaccuum");
	
	t1.setPriority(1);
	
	t2 = new Task("Mow the Lawn", "Mow the lawn", "Lawnmower, Trimmers");
	
	t2.setPriority(3);
	
	t3 = new Task("Take out the Trash", "Take out the trash and the recyclables", "Trash Bin");
	
	t3.setPriority(4);
	
	t4 = new Task("Do the Dishes", "Load the dish washer and clean the non dishwasher safe dishes", "Soap, Dishwasher, Sink, Scrub Brush");
	
	t4.setPriority(2);
	
	t5 = new Task("Fix the Car", "Replace the brake pads and right headlight", "Socket Wrench, Headlight, Brakepads");
	
	t5.setPriority(5);
	
	System.out.println(t1.toString());
	System.out.println("Priority level:" + t1.getPriority());
	System.out.println();
	System.out.println(t2.toString());
	System.out.println("Priority level:" + t2.getPriority());
	System.out.println();
	System.out.println(t3.toString());
	System.out.println("Priority level:" + t3.getPriority());
	System.out.println();
	System.out.println(t4.toString());
	System.out.println("Priority level:" + t4.getPriority());
	System.out.println();
	System.out.println(t5.toString());
	System.out.println("Priority level:" + t5.getPriority());
	System.out.println();
	
	}
}
