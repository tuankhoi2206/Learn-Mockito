package org.khoi.vu.mockito.business.impl;

import java.util.ArrayList;
import java.util.List;
import org.khoi.vu.mockito.data.api.ToDoService;

public class TodoBusinessImpl {
  private ToDoService todoService;

  public TodoBusinessImpl(ToDoService toDoService) {
    this.todoService = toDoService;
  }

  public List<String> retrieveTodosRelatedToSpring(String user) {
    List<String> filteredTodos = new ArrayList<String>();
    List<String> allTodos = todoService.retrieveTodos(user);
    for (String todo : allTodos) {
      if (todo.contains("Spring")) {
        filteredTodos.add(todo);
      }
    }
    return filteredTodos;
  }
}
