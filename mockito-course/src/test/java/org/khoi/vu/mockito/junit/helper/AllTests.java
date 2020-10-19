package org.khoi.vu.mockito.junit.helper;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({StringHelperParameterizedTest.class, StringHelperTest.class})
public class AllTests {
}