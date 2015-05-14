package org.araymond.springboot.quickstart.controllers;

import org.araymond.springboot.quickstart.beans.Todo;
import org.araymond.springboot.quickstart.services.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;
import java.util.List;

@Controller
@RequestMapping("/todo")
public class TodoController {

	@Inject
	TodoService todoService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String findAllTodo(Model model) {

		List<Todo> allTodos = todoService.findAll();

		model.addAttribute("todos", allTodos);

		return "todoList";
	}
}
