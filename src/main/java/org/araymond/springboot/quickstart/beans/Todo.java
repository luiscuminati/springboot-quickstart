package org.araymond.springboot.quickstart.beans;

import java.util.Date;

/**
 * Created by Anthony on 14/05/2015.
 */
public class Todo {
	private long id;
	private String todoText;
	private Date created;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTodoText() {
		return todoText;
	}
	public void setTodoText(String todoText) {
		this.todoText = todoText;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}

	public Todo() {
	}

	public Todo(String todoText, Date created) {
		this.todoText = todoText;
		this.created = created;
	}

}
