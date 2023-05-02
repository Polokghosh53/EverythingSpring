package com.polok.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList<>();
	
	private static int todosCount = 0;
	
	static {
		todos.add(new Todo(++todosCount, "polok","Learn AWS",
				LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todosCount, "polok","Learn DevOps",
				LocalDate.now().plusYears(2), false));
		todos.add(new Todo(++todosCount, "polok","Learn Full Stack Development",
				LocalDate.now().plusYears(3), false));
		todos.add(new Todo(++todosCount, "polok","Learn Java Stack Development",
				LocalDate.now().plusYears(4), false));
	}
	
	public List<Todo> findByUsername(String username) {
		return todos;
	}
	
	public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
		Todo todo = new Todo(++todosCount, username, description, targetDate, done);
		todos.add(todo);
	}
	
	public void deleteById(int id) {
		// todo.getId() == id
		// todo -> todo.getId() == id , functional programming
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		todos.removeIf(predicate);
	}
	
	public Todo findById(int id) {
		Predicate<? super Todo> predicate = todo -> todo.getId() == id;
		Todo todo = todos.stream().filter(predicate).findFirst().get();
		return todo;
	}
}
