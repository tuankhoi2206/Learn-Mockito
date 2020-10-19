package org.khoi.vu.mockito.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import org.khoi.vu.mockito.business.impl.TodoBusinessImpl;
import org.khoi.vu.mockito.data.api.ToDoService;

public class TodoBusinessImplMockTest {
  /**
   * <pre>
   * What is mocking?
   * Mocking is creating objects that simulate the behavior of real objects.
   * Unlike stubs, mock can be dynamically created from code - at runtime.
   * Mocks offer more functionality than stubbing.
   * You can verify method calls and a lot of other things.
   * </pre>
   */
  @Test
  public void testRetrieveTodosRelatedToSpring_usingAMock() {

    // This meaning when we took some data such as the following.
    ToDoService todoServiceMock = mock(ToDoService.class);
    List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
    when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);

    TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);

    List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
    assertEquals(2, filteredTodos.size());
  }

  @Test
  public void testRetrieveTodosRelatedToSpring_usingAMockWithEmptyList() {

    // This meaning when we took some data such as the following.
    ToDoService todoServiceMock = mock(ToDoService.class);
    List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
    when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);

    TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);

    List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
    assertEquals(0, filteredTodos.size());
  }
}
