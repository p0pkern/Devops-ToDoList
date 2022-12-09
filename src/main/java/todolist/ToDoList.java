package todolist;

import java.util.ArrayList;

/**
* The ToDoList program implements an application that stores
* a series of Tasks in a list. It can add, delete, and parse
* specific tasks.
*
* @author  Chris Peterman
* @version 1.0
* @since   2022-12-09
*/

public class ToDoList {
	private ArrayList<Task> tasks;
	
	public ToDoList() {
		tasks = new ArrayList<Task>();
	}

	public ArrayList<Task> getTasks() {
		return tasks;
	}

	public void setTasks(ArrayList<Task> tasks) {
		this.tasks = tasks;
	}
	
	public boolean addTask(Task task) {
		tasks.add(task);
		return true;
	}
	
}
