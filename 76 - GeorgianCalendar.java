import java.util.*;

public class div extends Thread {

    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2000));  // Check if the year 2000 is a leap year
        System.out.println(cal.isLeapYear(2021));  // Check if the year 2021 is a leap year
    }
}

Output:

true
false

Description: This code uses the `GregorianCalendar` class to check whether the given years (2000 and 2021) are leap years and prints the results.

import java.util.*;

public class div extends Thread {
    public static void main(String[] args) {
        GregorianCalendar c = new GregorianCalendar();
        System.out.println("Date before rolling: " + c.getTime());

        c.roll(Calendar.MONTH, true);  // Roll the month forward by 1, without affecting the year
        c.roll(Calendar.DATE, false);   // Roll the date backward by 1, without affecting the month or year
        c.roll(Calendar.YEAR, true);    // Roll the year forward by 1

        System.out.println("Date after rolling: " + c.getTime());
    }
}

Output:

Date before rolling: Wed May 26 07:53:24 IST 2021
Date after rolling: Sat Jun 25 07:53:24 IST 2022

Description: This code uses `GregorianCalendar` to perform rolling operations on the date components (month, date, and year) and prints the date before and after rolling.

import java.util.*;

public class div extends Thread {
    public static void main(String[] args) {
        GregorianCalendar c = new GregorianCalendar();
        System.out.println("Calendar: " + c.getTime());  // Print the current date and time

        System.out.println("The hashcode for this calendar is: " + c.hashCode());  // Print the hashcode of the calendar instance
    }
}

Output:

Calendar: Wed May 26 08:08:33 IST 2021
The hashcode for this calendar is: 1358707903

Description: This code creates a `GregorianCalendar` instance, prints the current date and time, and also prints the hashcode of the calendar instance.

package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class div_gregorian {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());  // Print the current date and time
        System.out.println(c.get(Calendar.DATE));  // Print the day of the month
        System.out.println(c.get(Calendar.SECOND));  // Print the current second
        System.out.println(c.get(Calendar.HOUR));  // Print the current hour (12-hour clock)
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));  // Print the current time in HH:mm:ss format

        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2018));  // Check if the year 2018 is a leap year

        // Print the first three available time zone IDs
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
    }
}

Description: This code demonstrates various operations using the `Calendar` and `GregorianCalendar` classes. It prints the current date and time, the day of the month, the current second, the current hour in both 12-hour and 24-hour formats, checks if the year 2018 is a leap year, and prints the first three available time zone IDs.