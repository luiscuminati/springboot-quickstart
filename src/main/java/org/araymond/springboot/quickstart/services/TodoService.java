package org.araymond.springboot.quickstart.services;

import org.araymond.springboot.quickstart.beans.Todo;

import java.util.List;

/**
 * Created by Anthony on 14/05/2015.
 */
public interface TodoService {
	List<Todo> findAll();
}
