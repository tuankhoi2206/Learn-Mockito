package org.khoi.vu.mockito.data.api;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements ToDoService {

  @Override
  public List<String> retrieveTodos(String user) {
    return Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
  }

  @Override
  public List<String> configureSomething(String user) {
    // TODO Auto-generated method stub
    return null;
  }
}
