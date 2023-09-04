Code Name: Maximum Long Value and Current Time

import java.util.*;

public class MaximumLongValueAndCurrentTime extends Thread {
    public static void main(String[] args) {
        System.out.println("The maximum value of long is: " + Long.MAX_VALUE);
        System.out.println("The value of current time in ms: " + System.currentTimeMillis());
    }
}

Output: 
The maximum value of long is: 9223372036854775807
The value of current time in ms: 1621708466975

Description: This Java program prints the maximum value of the `long` data type and the current time in milliseconds using `Long.MAX_VALUE` and `System.currentTimeMillis()`.

Code Name: Current Date and Date from Milliseconds

import java.util.*;

public class CurrentDateAndDateFromMilliseconds extends Thread {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println("The current date is: " + d);

        Date d1 = new Date(1621709639111L);
        System.out.println("The date calculated from milliseconds is: " + d1);
    }
}

Output:
The current date is: Sun May 23 00:24:17 IST 2021
The date calculated from milliseconds is: Sun May 23 00:23:59 IST 2021

Description: This Java program creates `Date` objects to display the current date and another date calculated from milliseconds.

Code Name: Date Comparison

import java.util.*;

public class DateComparison extends Thread {
    public static void main(String[] args) {
        Date d = new Date();

        Date d1 = new Date(2021 - 1900, 11, 24);  // Note: Year should be specified as years since 1900
        System.out.println(d1.compareTo(d));
    }
}

Output: 
1

Description: This Java program compares two `Date` objects (`d` and `d1`) and prints the result of the comparison. In this case, it prints `1` because `d1` is after `d`.

Code Name: Milliseconds Since 1970
import java.util.*;

public class MillisecondsSince1970 extends Thread {
    public static void main(String[] args) {
        Date d = new Date(2021 - 1900, 5 - 1, 23); // Note: Year and month are specified relative to 1900 and 0-based index

        System.out.println("The number of milliseconds passed since Jan 1, 1970: " + d.getTime());
    }
}

Output:
The number of milliseconds passed since Jan 1, 1970: 1621767606000

Description: This Java program calculates and prints the number of milliseconds that have passed since January 1, 1970, using the `getTime()` method on a `Date` object.

Code Name: Date Methods

package com.company;

import java.util.Date;

public class DateMethods {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println("The current date is: " + d.getDate());
        System.out.println("The current year is: " + (d.getYear() + 1900)); // Adjust for year offset
    }
}

Output: 
The current date is: 4
The current year is: 2023

Description: This Java program prints the current date and year using the `getDate()` and `getYear()` methods on a `Date` object, adjusting for the year offset by adding 1900 to the year obtained from `getYear()`.