package org.khoi.vu.mockito.data.api;

import java.util.List;

// Test TodoServiceImpl using TodoServiceStub
public interface ToDoService {
  List<String> retrieveTodos(String user);

  List<String> configureSomething(String user);
}
