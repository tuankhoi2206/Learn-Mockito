package org.khoi.vu.junit.helper;

import static org.junit.Assert.assertArrayEquals;
import java.util.Arrays;
import org.junit.Test;

public class ArrayCompareTest {

  @Test
  public void testArraySort_RandomArray() {
    int[] numbers = {3, 9, 3, 1};
    int[] expected = {1, 3, 3, 9};
    assertArrayEquals(expected, numbers);
  }

  @Test(expected = NullPointerException.class)
  public void testArraySort_NullArray() {
    int[] numbers = null;
    Arrays.sort(numbers);
  }
}
