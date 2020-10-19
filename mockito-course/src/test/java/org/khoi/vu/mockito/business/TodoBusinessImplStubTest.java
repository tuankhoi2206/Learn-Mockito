package org.khoi.vu.mockito.business;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;
import org.khoi.vu.mockito.business.impl.TodoBusinessImpl;
import org.khoi.vu.mockito.data.api.ToDoService;
import org.khoi.vu.mockito.data.api.TodoServiceStub;

public class TodoBusinessImplStubTest {

  @Test
  public void testRetrieveTodosRelatedToSpring_usingAStub() {

    ToDoService toDoServiceStub = new TodoServiceStub();
    TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(toDoServiceStub);
    List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
    assertEquals(2, filteredTodos.size());
  }
}
