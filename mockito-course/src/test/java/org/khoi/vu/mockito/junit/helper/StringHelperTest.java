package org.khoi.vu.mockito.junit.helper;

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;

public class StringHelperTest {

  @Test
  public void test() {
    StringHelper stringHelper = new StringHelper();
    assertEquals("B", stringHelper.truncateAInFirst2Positions("AAB"));
  }

  @Test
  public void testArraySort_RandomArray() {
    int[] numbers = {12, 3, 4, 1};
    int[] expected = {1, 3, 4, 12};

    Arrays.sort(numbers);
    assertArrayEquals(expected, numbers);

  }

  @Test(expected = NullPointerException.class)
  public void testArraySort_NullArray() throws NullPointerException {
    int[] numbers = null;
    try {
      Arrays.parallelSort(numbers);
    } catch (Exception e) {
      throw new NullPointerException();
    }
  }
}
