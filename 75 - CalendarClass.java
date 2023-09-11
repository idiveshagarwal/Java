import java.util.*;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());  // getCalendarType() returns the type of the calendar
    }
}

Output: gregory

Description: This code defines a class named `CalendarExample` and uses the `Calendar` class to get the type of the calendar system in use (e.g., "gregory").

import java.util.*;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("Current year is: " + c.get(Calendar.YEAR));
        System.out.println("Current month is: " + (c.get(Calendar.MONTH) + 1)); // The indexing for month field ranges from [0,11]
        System.out.println("Current day is: " + c.get(Calendar.DAY_OF_WEEK));
        System.out.println("Current hour is: " + c.get(Calendar.HOUR_OF_DAY));
        System.out.println("Current minute is: " + c.get(Calendar.MINUTE));
        System.out.println("Current second is: " + c.get(Calendar.SECOND));
    }
}

Output:

Current year is: 2023
Current month is: 9
Current day is: 1
Current hour is: 0
Current minute is: 0
Current second is: 0

Description: This code retrieves various date and time components using the `Calendar` class and prints them out. Note that the month index is adjusted by 1 because it is 0-based.

import java.util.*;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("Current date is: " + c.getTime());
        c.add(Calendar.YEAR, 4);
        System.out.println("After 4 years: " + c.getTime());
        c.add(Calendar.YEAR, -12);
        System.out.println("Before 12 years: " + c.getTime());
        c.add(Calendar.MONTH, 2);
        System.out.println("After 2 months: " + c.getTime());
    }
}

Output:

Current date is: Sun Sep 11 00:00:00 IST 2023
After 4 years: Wed Sep 11 00:00:00 IST 2027
Before 12 years: Thu Sep 11 00:00:00 IST 2015
After 2 months: Sat Nov 11 00:00:00 IST 2015


Description: This code uses the `Calendar` class to manipulate dates by adding and subtracting years and months, and it prints out the resulting dates.

import java.util.*;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("The maximum number of weeks in a year: " + c.getMaximum(Calendar.WEEK_OF_YEAR));
    }
}

Output: The maximum number of weeks in a year: 53

Description: This code retrieves and prints the maximum number of weeks in a year according to the calendar system in use.