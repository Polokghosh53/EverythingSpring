package com.polok.springboot.myfirstwebapp.todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoController {
	
	private TodoService todoService;
	
	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}
	
	// /list-todos
	@RequestMapping("list-todos") 
	public String listAllTodos(ModelMap model) {
		List<Todo> todos = todoService.findByUsername("polok");
		model.addAttribute("todos",todos);
		
		return "listTodos";
	}
}
