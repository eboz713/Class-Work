//****************************************************************************************
//Task.java                              Author: Erik Boswell
//
//Creates a task object with necessary details and implements a priority level
//****************************************************************************************

public class Task implements Priority
{
	
	private String task, details, tools;
	private int priorityLevel;
	
	public Task(String taskname, String description, String tools)
	{
		task = taskname;
		details = description;
		this.tools = tools;
		priorityLevel = 1;
	}
	
	public void setPriority(int level)
	{
		priorityLevel = level;
	}
	
	public int getPriority()
	{
		return priorityLevel;
	}
	
	public String getTask()
	{
		return task;
	}
	
	public String getDetails()
	{
		return details;
	}
	
	public String getTools()
	{
		return tools;
	}
	
	public String toString()
	{
		return task + ": " + details + ". Requires " + tools;
	}
}
