package edu.cnm.deepdive.util;

import com.sun.org.apache.bcel.internal.generic.DASTORE;

public class DateOnly {

  private static final int DAYS_PER_YEAR = 365;
  final int STANDARD_MONTHS_YEAR = 12;
  final int STANDARD = 1;
  private static final int BASELINE_YEAR = 1970;
  final int MONTHS_PER_YEAR = 12;
  private static final int[] DAYS_PER_MONTHS = {31,28,31,30,31,30,31,31,30,31,30,31};
  private static final int BASELINE_LEAP_DAYS
  private static int dayOfYear;


  public static int elapsedDays(int year, int month, int day) {

    return daysElapsedFromBaseline(year) + dayOfYear(year, month, day);

  }

  private static boolean isLeapYear(int year) {

    return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);

  }


  public static int daysInMonth(int year, int month) {
    return DAYS_PER_MONTHS[month] + ((month == 1 && isLeapYear(year)) ? 1 : 0);
  }

  private static int leapDaysFromZero(int year) {
    return 1 +
        + Math.floorDiv(year -1, 4)
        - Math.floorDiv(year - 1, 100)
        +Math.floorDiv(year - 1, 400);
  }

  private static int leapDaysFromBaseline(int year) {
    return leapDaysFromZero(year) - BASELINE_LEAP_DAYS;
  }

  private static int daysElapsedFromBaseline(int year)  {
    return DAYS_PER_YEAR * (year - BASELINE_YEAR) + leapDaysFromBaseline(year);
  }




  public static int daysOfYear(int year, int month, int day)  {
    int count = 0;
    for (int i = 0; i < month; i++)  {
      count += daysInMonth(year, i);
      DAYS_PER_MONTHS[0] += 1;
    }
    return yearDays;
  } // This will add up for each month in the
  // year but how would I be able to stop at a certain number of months like 7 months?
  //
  // My initial thought is that there will be another loop that just adds on the remainder written as such

  public static int remainderDays(int year, int month) {

    if

  }




}
