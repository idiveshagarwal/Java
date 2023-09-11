import java.time.*;

public class JavaTimeExample {
    public static void main(String[] args) {
        Clock cl = Clock.systemDefaultZone();
        System.out.println(cl.getZone());  // Print the time zone of the default clock
    }
}

Output: Asia/Calcutta

Description: This code uses the `Clock` class from the `java.time` package to get the default system clock's time zone and prints it.

import java.time.*;

public class JavaTimeExample {
    public static void main(String[] args) {
        Clock cl = Clock.systemUTC();
        System.out.println(cl.instant());  // Print the current instant in UTC format
    }
}

Output: 2021-05-26T06:43:05.064640700Z

Description: This code uses the `Clock` class to create a clock set to UTC (Coordinated Universal Time) and prints the current instant in UTC format.

import java.time.*;

public class JavaTimeExample {
    public static void main(String[] args) {
        Duration d1 = Duration.between(LocalTime.MIN, LocalTime.NOON);  
        System.out.println(d1.isNegative());  // Check if d1 is negative

        Duration d2 = Duration.between(LocalTime.MAX, LocalTime.MIN);  
        System.out.println(d2.isNegative());  // Check if d2 is negative
    }
}

Output:

false
true

Description: This code calculates the duration between `LocalTime.MIN` (midnight) and `LocalTime.NOON` (noon) and checks if it's negative. Then, it calculates the duration between `LocalTime.MAX` (23:59:59.999999999) and `LocalTime.MIN` (midnight) and checks if it's negative.

import java.time.*;

public class JavaTimeExample {
    public static void main(String[] args) {
        Duration d1 = Duration.between(LocalTime.MIN, LocalTime.MIDNIGHT);
        System.out.println(d1.isZero());  // Check if d1 is zero

        Duration d2 = Duration.between(LocalTime.MAX, LocalTime.MIN);  
        System.out.println(d2.isZero());  // Check if d2 is zero
    }
}

Output:
true
false

Description: This code calculates the duration between `LocalTime.MIN` (midnight) and `LocalTime.MIDNIGHT` (midnight) and checks if it's zero. Then, it calculates the duration between `LocalTime.MAX` (23:59:59.999999999) and `LocalTime.MIN` (midnight) and checks if it's zero.

import java.time.*;

public class JavaTimeExample {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);  // Print the current date
    }
}

Output: 2021-05-26

Description: This code uses the `LocalDate` class to get the current date and prints it.

import java.time.*;

public class JavaTimeExample {
    public static void main(String[] args) {
        LocalDate d = LocalDate.parse("2021-05-27");
        LocalDate d1 = LocalDate.parse("2021-05-26");
        LocalDate d2 = LocalDate.parse("2021-05-26");

        System.out.println(d1.equals(d));  // Check if d1 equals d
        System.out.println(d2.equals(d1));  // Check if d2 equals d1
    }
}

Output:

false
true

Description: This code parses two `LocalDate` instances and checks if they are equal using the `equals` method.

import java.time.*;

public class JavaTimeExample {
    public static void main(String[] args) {
        LocalDate d = LocalDate.parse("2021-05-27");
        System.out.println(d.withYear(2001));  // Change the year to 2001 and print the result
    }
}

Output: 2001-05-27

Description: This code parses a `LocalDate` instance and changes its year to 2001 using the `withYear` method.

import java.time.*;

public class JavaTimeExample {
    public static void main(String[] args) {
        LocalTime t = LocalTime.now();
        System.out.println(t);  // Print the current time
    }
}

Output: 13:13:36.198479100

Description: This code uses the `LocalTime` class to get the current time and prints it.

import java.time.*;

public class JavaTimeExample {
    public static void main(String[] args) {
        LocalTime t = LocalTime.of(13, 18, 29);
        System.out.println("Time before: " + t);

        LocalTime t1 = t.plusHours(5);
        System.out.println("Time after adding 5 hours: " + t1);
    }
}

Output:

Time before: 13:18:29
Time after adding 5 hours: 18:18:29

Description: This code creates a `LocalTime` instance and adds 5 hours to it, then prints both the original and modified times.

import java.time.*;

public class JavaTimeExample {
    public static void main(String[] args) {
        LocalTime t = LocalTime.of(15, 28, 19);
        System.out.println("Time before: " + t);

        LocalTime t1 = t.minusMinutes(8);
        System.out.println("Time after subtracting 8 minutes: " + t1);
    }
}

Output:

Time before: 15:28:19
Time after subtracting 8 minutes: 15:20:19

Description: This code creates a `LocalTime` instance and subtracts 8 minutes from it, then prints both the original and modified times.

package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class div_java_time {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);  // Print the current date

        LocalTime t = LocalTime.now();
        System.out.println(t);  // Print the current time

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);  // Print the current date and time
    }
}

Description: This code demonstrates various operations using `LocalDate`, `LocalTime`, and `LocalDateTime` classes, and prints the current date, time, and date-time.