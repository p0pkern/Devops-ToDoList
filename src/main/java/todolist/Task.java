package todolist;

import java.time.LocalDateTime;
import java.util.UUID;

public class Task {
	private final UUID id;
	private final LocalDateTime date;
	private String title;
	private String text;
	private boolean completed;

	public Task(LocalDateTime date, String title, String text) {
		this.date = date;
		this.title = title;
		this.text = text;
		this.id = UUID.randomUUID();
		this.completed = false;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public UUID getId() {
		return id;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

}
