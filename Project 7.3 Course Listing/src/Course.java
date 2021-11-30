//****************************************************************************************
//Course.java                              Author: Erik Boswell
//
//Implements a Course class with student and test data
//****************************************************************************************

import java.util.ArrayList;

public class Course {

	private String coursename;
	
	ArrayList<Student> course = new ArrayList<Student>();
	
	public Course(String name)
	{
		coursename = name;
	}
	
	public void addStudent(Student student)
	{
		course.add(student);
	}
	
	public int average()
	{
		int score = 0;
		
		for(int roster = 0; roster < course.size(); roster++)
		{
			score = score + course.get(roster).average();
		}
		
		int avg = score / course.size();
		
		return avg;
	}
	
	public void roll()
	{
		for(int roster = 0; roster < course.size(); roster++)
		{
			Student student = course.get(roster);
			String name = student.getName(student);
			System.out.println(name);
		}
	}
	
}
