Code Name: Leap Year Check
import java.util.*;

public class LeapYearCheck extends Thread {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2000));
        System.out.println(cal.isLeapYear(2021));
    }
}

Output:
true
false

Description: This Java program uses `GregorianCalendar` to check if the given years (2000 and 2021) are leap years and prints the results.

Code Name: Rolling Calendar Fields
import java.util.*;

public class RollingCalendarFields extends Thread {
    public static void main(String[] args) {
        GregorianCalendar c = new GregorianCalendar();
        System.out.println("Date before rolling: " + c.getTime());

        c.roll(Calendar.MONTH, true);
        c.roll(Calendar.DATE, false);
        c.roll(Calendar.YEAR, true);

        System.out.println("Date after rolling: " + c.getTime());
    }
}

Output: 
Date before rolling: Wed May 26 07:53:24 IST 2021
Date after rolling: Sat Jun 25 07:53:24 IST 2022

Description: This Java program demonstrates how to roll (increment or decrement) calendar fields such as month, date, and year using `GregorianCalendar` and then prints the date before and after rolling.

Code Name: Calendar Hashcode
import java.util.*;

public class CalendarHashcode extends Thread {
    public static void main(String[] args) {
        GregorianCalendar c = new GregorianCalendar();
        System.out.println("Calendar: " + c.getTime());

        System.out.println("The hashcode for this calendar is: " + c.hashCode());
    }
}

Output:
Calendar: Wed May 26 08:08:33 IST 2021
The hashcode for this calendar is: 1358707903

Description: This Java program creates a `GregorianCalendar` and prints the current date and time along with the hashcode of the calendar object.

Code Name: Various Calendar Operations

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class VariousCalendarOperations {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
        
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2018));
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
    }
}

Description: This Java program demonstrates various calendar operations using `Calendar`, `GregorianCalendar`, and `TimeZone` classes. It prints the current date and time, specific calendar fields (date, second, hour), checks if 2018 is a leap year, and displays available time zone IDs.