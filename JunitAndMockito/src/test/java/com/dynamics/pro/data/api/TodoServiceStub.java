package com.dynamics.pro.data.api;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService
{

	@Override
	public List<String> retrivedTodos(String users) {
		// TODO Auto-generated method stub
		return Arrays.asList("Learn Spring MVC","Learn Spring","Learn to Dance",
				"Learn to p[rogramming");
	}

}
