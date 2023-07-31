package com.dynamics.pro.mockito.business;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.dynamics.pro.business.api.TodoBusinessImpl;
import com.dynamics.pro.data.api.TodoService;
import com.dynamics.pro.data.api.TodoServiceStub;

class TOdoBusinessImplStubTest {

	@Test
	void test() {
		TodoService todoService = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		List<String> filterTOdolist = todoBusinessImpl.retrivedTodoRelatedtoString("Dummhy");

		assertEquals(2, filterTOdolist.size());
	}

}
