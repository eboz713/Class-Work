//****************************************************************************************
//main.java                              Author: Erik Boswell
//
//Implements Speaker.java in regards to various speakers
//****************************************************************************************

public class main
{

	public static void main(String[] args)
	{
	
	preacher Preacher = new preacher();
	publicist Publicist = new publicist();
	author Author = new author();
	
	
	Preacher.speak();
	Preacher.announce("Do unto others as you wish done unto yourself.");
	System.out.println();
	Publicist.speak();
	Publicist.announce("Today the president attended peace talks in France.");
	System.out.println();
	Author.speak();
	Author.announce("Moby Dick is a great read.");
	
	}
	
}
