package org.khoi.vu.JUniCourse;

public class StringHelper {
  public String truncateAInFirst2Positions(String str) {

    final String SIGN_REPLACE = "A";
    final String CHARACTER_AFTER_REPLACE = "";

    if (str.length() <= 2) {
      return str.replaceAll(SIGN_REPLACE, CHARACTER_AFTER_REPLACE);
    }

    String first2Chars = str.substring(0, 2);
    String stringMinusFirst2Chars = str.substring(2);

    return first2Chars.replace(SIGN_REPLACE, CHARACTER_AFTER_REPLACE) + stringMinusFirst2Chars;
  }

  public boolean areFirstAndLastTwoCharactersTheSame(String str) {
    if (str.length() <= 1) {
      return false;
    }

    if (str.length() == 2) {
      return true;
    }

    String first2Chars = str.substring(0, 2);
    String last2Chars = str.substring(str.length() - 2);

    return first2Chars.equals(last2Chars);
  }
}
