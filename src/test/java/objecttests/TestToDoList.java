package objecttests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import todolist.Task;
import todolist.ToDoList;

/**
* The Task program implements an application that creates an
* individual task with a date - formatted LocalDateTime,
* title - Heading of the task, - text - the contents of the task.
*
* @author  Chris Peterman
* @version 1.0
* @since   2022-12-09
*/

class TestToDoList {
	ToDoList todo;
	
	@BeforeEach
	public void setup() {
		todo = new ToDoList();
	}

	@Test
	void testAddOneTask() {
		LocalDateTime time = LocalDateTime.now();
		String title = "Task 1";
		String message = "The text of message 1";
		
		Task task = new Task(time, title, message);
		
		assertTrue(todo.addTask(task));
	}
	
	@Test
	void testAddOneTaskThenRemoveIt() {
		LocalDateTime time = LocalDateTime.now();
		String title = "Task 1";
		String message = "The text of message 1";
		
		Task task = new Task(time, title, message);
		
		todo.addTask(task);
		
		assertTrue(todo.deleteTask(task.getId().toString()));
		
	}
	
	@Test
	void testAddThreeTasksThenRemoveOneOfThem() {
		LocalDateTime time = LocalDateTime.now();
		String title = "Task 1";
		String message = "The text of message 1";
		
		Task task1 = new Task(time, title, message);
		Task task2 = new Task(time, title, message);
		Task task3 = new Task(time, title, message);
		
		todo.addTask(task1);
		todo.addTask(task2);
		todo.addTask(task3);
		
		assertTrue(todo.deleteTask(task2.getId().toString()));
	}

}
