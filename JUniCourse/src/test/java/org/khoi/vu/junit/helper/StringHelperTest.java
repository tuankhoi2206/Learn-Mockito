package org.khoi.vu.junit.helper;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.khoi.vu.JUniCourse.StringHelper;

public class StringHelperTest {

  StringHelper helper;

  @BeforeClass
  public static void beforeClass() {
    System.out.println("Before Class");
    System.out.println("Some database connections or thing like that....");
  }

  @Before
  public void setup() {
    helper = new StringHelper();
  }

  @Test
  public void testTruncateAInFirst2Position1() {

    assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
    // expected, actual
  }

  @Test
  public void testTruncateAInFirst2Position2() {
    assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
  }

  @Test
  public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
    boolean actualValue = helper.areFirstAndLastTwoCharactersTheSame("ABCD");
    assertFalse(actualValue);
  }

  @Test
  public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
    boolean actualValue = helper.areFirstAndLastTwoCharactersTheSame("ABAB");
    assertTrue(actualValue);
  }

  @After
  public void cancelAll() {
    System.out.println("Do something. For instance: distroy variable....");
  }
}
