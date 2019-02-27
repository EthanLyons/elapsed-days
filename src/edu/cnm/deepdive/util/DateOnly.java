package edu.cnm.deepdive.util;

import com.sun.org.apache.bcel.internal.generic.DASTORE;

public class DateOnly {



  final int STANDARD_DAYS_YEAR = 365;
  final int STANDARD_MONTHS_YEAR = 12;
  final int STANDARD = 1;
  final int GROUND_ZERO = 1970;
  final int MONTHS_PER_YEAR = 12;
  private static final int[] DAYS_PER_MONTHS = {31,28,31,30,31,30,31,31,30,31,30,31};
  private static int yearDays;
  private static boolean isLeapYear(int year) {

    return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);

  }
  public static int daysPerMonth(int year, int month) {


    if (! isLeapYear(year) || month != 1) {
      return DAYS_PER_MONTHS[month];
    }

    return DAYS_PER_MONTHS[month] + 1;

  }

  public static int daysPerYear(int month)  {

    for (int i = 0; i < MONTHS_PER_YEAR; i++)  {
      yearDays += DAYS_PER_MONTHS[month];
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


  public static int elapsedDays(int year, int month, int day) {




    final int STANDARD_DAYS_YEAR = 365;
    final int STANDARD_MONTHS_YEAR = 12;
    final int GROUND_ZERO = 1970;
    int days = 0;
    int months = 0;
    days = (year - GROUND_ZERO) * yearDays;
    months = (year - GROUND_ZERO) * DAYS_PER_MONTHS[month];
    System.out.println(days);
    return days;
  }

}
