package org.khoi.vu.junit.helper;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * <pre>
 * System name : JUniCourse
 * Version     : 1.0
 * Created date: Aug 30, 2020 10:03:41 PM
 * Description : This used group test.
 * Author      : KhoiVu
 * Copyright (c) 2020. All rights reserved
 * </pre>
 */
@RunWith(Suite.class)
@SuiteClasses({QuickBeforeAfterTest.class, StringHelperTest.class})
public class AllTests {
}
