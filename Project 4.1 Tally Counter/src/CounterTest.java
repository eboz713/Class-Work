//****************************************************************************************
//CounterTest.java                              Author: Erik Boswell
//
//Tests the counter class
//****************************************************************************************
public class CounterTest
{

	public static void main(String[] args)
	{
		counter counter1,  counter2;
		
		counter1 = new counter();
		counter2 = new counter();
		
		System.out.println("Counter 1: " + counter1.getCount() + ",  Counter 2: " 
		+ counter2.getCount());
		
		counter1.click();
		
		System.out.println("Counter 1: " + counter1.getCount() + ",  Counter 2: " 
		+ counter2.getCount());
		
		counter2.click();
		
		System.out.println("Counter 1: " + counter1.getCount() + ",  Counter 2: " 
		+ counter2.getCount());
		
		counter1.reset();
		
		System.out.println("Counter 1: " + counter1.getCount() + ",  Counter 2: " 
		+ counter2.getCount());
		
		counter2.reset();
		
		System.out.println("Counter 1: " + counter1.getCount() + ",  Counter 2: " 
		+ counter2.getCount());

	}

}
