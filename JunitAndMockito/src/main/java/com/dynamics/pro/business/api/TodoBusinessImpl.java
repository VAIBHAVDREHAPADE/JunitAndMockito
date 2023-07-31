package com.dynamics.pro.business.api;

import java.util.ArrayList;
import java.util.List;

import com.dynamics.pro.data.api.TodoService;

public class TodoBusinessImpl {

	private TodoService todoService;

	public TodoBusinessImpl(TodoService todoService) {
		super();
		this.todoService = todoService;
	}


	public List<String> retrivedTodoRelatedtoString(String user){
		List<String> filterTOdos = new ArrayList<>();
		List<String> todos = todoService.retrivedTodos(user);
		for(String todo : todos) {
			if(todo.contains("Spring"))
				filterTOdos.add(todo);		
		}
		return filterTOdos;
	}
}
