package org.araymond.springboot.quickstart.services.impl;

import org.araymond.springboot.quickstart.beans.Todo;
import org.araymond.springboot.quickstart.services.TodoService;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by Anthony on 14/05/2015.
 */
@Service
public class MockedTodoServiceImpl implements TodoService {

	/**
	 * Database mocked
	 */
	private static Map<Long, Todo> todos = new HashMap<>();
	//Executed once when the service is instantiated by the container
	static {
		Todo todo = new Todo("Add a nice style", new Date());
		todo.setId(1L);
		todos.put(todo.getId(), todo);

		Todo todo2 = new Todo("Make this project an artifact", new Date());
		todo2.setId(2L);
		todos.put(todo2.getId(), todo2);
	}

	@Override
	public List<Todo> findAll() {
		return new ArrayList<>(this.todos.values());
	}
}
