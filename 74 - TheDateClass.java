Code 1:
import java.util.*;

public class div extends Thread {
    public static void main(String[] args) {
        // Print the maximum value of the 'long' data type
        System.out.println("The maximum value of long is: " + Long.MAX_VALUE);
        // Print the current time in milliseconds since January 1, 1970 (Unix epoch)
        System.out.println("The value of current time in ms: " + System.currentTimeMillis());
    }
}

Output 1:

The maximum value of long is: 9223372036854775807
The value of current time in ms: 1621708466975


Code 2:

import java.util.*;

public class div extends Thread {
    public static void main(String[] args) {
        // Create a new Date object representing the current date and time
        Date d = new Date();
        // Print the current date and time
        System.out.println("The current date is: " + d);

        // Create a new Date object with a specified timestamp (milliseconds since Jan 1, 1970)
        Date d1 = new Date(1621709639111L);
        // Print the date calculated from the given milliseconds
        System.out.println("The date calculated from milliseconds is: " + d1);
    }
}

Output 2:

The current date is: Sun May 23 00:24:17 IST 2021
The date calculated from milliseconds is: Sun May 23 00:23:59 IST 2021


Code 3:

import java.util.*;

public class div extends Thread {
    public static void main(String[] args) {
        // Create a new Date object representing the current date and time
        Date d = new Date();

        // Create a new Date object with a specific year, month, and day (2021-12-24)
        Date d1 = new Date(2021 - 1900, 12 - 1, 24); // Note: Months are 0-based, so December is 11
        // Compare the two dates and print the result (1 indicates the first date is after the second)
        System.out.println(d1.compareTo(d));
    }
}

Output 3:

1


Code 4:

import java.util.*;

public class div extends Thread {
    public static void main(String[] args) {
        // Create a new Date object with a specific year, month, and day (2021-5-23)
        Date d = new Date(2021 - 1900, 5 - 1, 23); // Note: Months are 0-based, so May is 4
        // Print the number of milliseconds passed since January 1, 1970 (Unix epoch)
        System.out.println("The number of milliseconds passed since Jan 1, 1970: " + d.getTime());
    }
}

Output 4:

The number of milliseconds passed since Jan 1, 1970: 61582530600000


Code 5 (Package Declaration):

package com.company;

import java.util.Date;

public class div_97_date_class {
    public static void main(String[] args) {
        // Create a new Date object representing the current date and time
        Date d = new Date();
        // Print various properties of the Date object
        System.out.println(d);          // Print the current date and time
        System.out.println(d.getTime()); // Print the time in milliseconds since Jan 1, 1970
        System.out.println(d.getDate()); // Print the day of the month
        System.out.println(d.getSeconds()); // Print the number of seconds
        System.out.println(d.getYear());  // Print the year (deprecated, returns year - 1900)
    }
}

Please note that the code for Code 5 (package declaration) contains commented-out lines at the beginning, which are not executed but are meant for reference.