//****************************************************************************************
//PairOfDice.java                              Author: Erik Boswell
//
//Class for simulating rolling a pair of dice
//****************************************************************************************

public class PairOfDice
{
	private final int MAX = 6;
	
	private int faceValue_a;
	private int faceValue_b;
	
	public PairOfDice()
	{
		faceValue_a = 1;
		faceValue_b = 1;
	}
	
	public void roll()
	{
		faceValue_a = (int)(Math.random() * MAX) + 1;
		faceValue_b = (int)(Math.random() * MAX) + 1;
	}
	
	public int get_faceValue_a()
	{
		return faceValue_a;
	}
	
	public int get_faceValue_b()
	{
		return faceValue_b;
	}
	
	public void set_faceValue_a(int value_a)
	{
		faceValue_a = value_a;
	}
	
	public void set_faceValue_b(int value_b)
	{
		faceValue_b = value_b;
	}
	
	public int roll_total()
	{
		return faceValue_a + faceValue_b;
	}
	
}