package objecttests;


import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeClass;

import todolist.Task;
import todolist.ToDoList;

public class TestTask {

	@Test
	public void testTaskCreation() {
		LocalDateTime today = LocalDateTime.now();
		String title = "new todo";
		String text = "this is text";
		Task task = new Task(today, title, text);
		
		assertEquals(task.getDate(), today);
		assertEquals(task.getTitle(), title);
		assertEquals(task.getText(), text);
	}
	
	@Test 
	public void testVerifyCreationOfUUID() {
		LocalDateTime today = LocalDateTime.now();
		String title = "new todo";
		String text = "this is text";
		Task task = new Task(today, title, text);
		
		String regex = "[\\w\\d]{8}-[\\w\\d]{4}-[\\w\\d]{4}-[\\w\\d]{4}-[\\w\\d]{12}";
		assertTrue(task.getId().toString().matches(regex));
	}

}
