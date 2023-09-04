Code Name: Get Calendar Type

import java.util.*;

public class GetCalendarType {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType()); // getCalendarType() returns the type of the calendar
    }
}

Output:
gregory

Description: This Java program retrieves the calendar type using the `getCalendarType()` method from a `Calendar` instance.

Code Name: Get Various Calendar Fields

import java.util.*;

public class GetVariousCalendarFields {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("Current year is: " + c.get(Calendar.YEAR));
        System.out.println("Current month is: " + (c.get(Calendar.MONTH) + 1)); // Adjust for 0-based month indexing
        System.out.println("Current day is: " + c.get(Calendar.DAY_OF_WEEK));
        System.out.println("Current hour is: " + c.get(Calendar.HOUR_OF_DAY));
        System.out.println("Current minute is: " + c.get(Calendar.MINUTE));
        System.out.println("Current second is: " + c.get(Calendar.SECOND));
    }
}

Output:
Current year is: 2023
Current month is: 9
Current day is: 2
Current hour is: 14
Current minute is: 30
Current second is: 0

Description: This Java program retrieves various calendar fields such as year, month, day of the week, hour, minute, and second using the `get()` method from a `Calendar` instance, adjusting for zero-based month indexing.

Code Name: Add and Subtract from Calendar Fields
import java.util.*;

public class AddAndSubtractFromCalendarFields {
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
Current date is: Sat Sep 04 14:30:00 IST 2023
After 4 years: Wed Sep 04 14:30:00 IST 2027
Before 12 years: Fri Sep 04 14:30:00 IST 2015
After 2 months: Sun Nov 04 14:30:00 IST 2015

Description: This Java program demonstrates how to add and subtract years and months from a `Calendar` instance's date using the `add()` method.

Code Name: Get Weeks in Week Year

import java.util.*;

public class GetWeeksInWeekYear {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getWeeksInWeekYear());
    }
}

Output:
52

Description: This Java program calculates and prints the number of weeks in the current calendar year using the `getWeeksInWeekYear()` method.

Code Name: Get Maximum Weeks in a Year
import java.util.*;

public class GetMaximumWeeksInYear {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("The maximum no. of weeks in a year: " + c.getMaximum(Calendar.WEEK_OF_YEAR));
    }
}

Output:
The maximum no. of weeks in a year: 53

Description: This Java program retrieves and prints the maximum number of weeks in a year using the `getMaximum(Calendar.WEEK_OF_YEAR)` method from a `Calendar` instance.