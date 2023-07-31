package com.dynamics.pro.mockito.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.dynamics.pro.business.api.TodoBusinessImpl;
import com.dynamics.pro.data.api.TodoService;

class TOdoBusinessImplMockTest {

	@Test
	public void test() {
		TodoService todoMockService = mock(TodoService.class);
		List<String> todos = Arrays.asList("Learn Spring MVC","Dummy","Dummy", "Learn Spring", "Learn to Dance",
				"Learn to p[rogramming");
		when(todoMockService.retrivedTodos("Dummy")).thenReturn(todos);

		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoMockService);
		List<String> filterTOdolist = todoBusinessImpl.retrivedTodoRelatedtoString("Dummy");

		assertEquals(2, filterTOdolist.size());
	}

}
