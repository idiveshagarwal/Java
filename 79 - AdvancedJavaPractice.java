import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<>(); // Create an ArrayList to store strings
        ar.add("Student 1");
        ar.add("Student 2");
        ar.add("Student 3");
        ar.add("Student 4");
        ar.add("Student 5");
        ar.add("Student 6");
        ar.add("Student 7");
        ar.add("Student 8");
        ar.add("Student 9");
        ar.add("Student 10");
        
        for(String student : ar){  // Iterate through the ArrayList and print each student
            System.out.println(student);
        }
    }
}

Output:

Student 1
Student 2
Student 3
Student 4
Student 5
Student 6
Student 7
Student 8
Student 9
Student 10

Description: This code demonstrates the use of an `ArrayList` to store and iterate through a list of student names.

import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date d = new Date(); // Create a Date object to represent the current date and time
        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds()); // Print the current time
    }
}

Output:

19:13:17

Description: This code uses the `Date` class to get the current time (hours, minutes, and seconds) and prints it.

import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance(); // Get a Calendar instance representing the current date and time
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND)); // Print the current time
    }
}

Output:

19:15:26

Description: This code uses the `Calendar` class to get the current time (hours, minutes, and seconds) and prints it.

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeFormatterExample {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now(); // Get the current date and time
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s"); // Define a custom time format
        String myDate = dt.format(df); // Format the date and time using the specified format
        System.out.println(myDate); // Print the formatted date and time
    }
}

Output:

19:27:59

Description: This code uses `LocalDateTime` and `DateTimeFormatter` to format the current date and time according to a custom time format ("H:m:s") and prints it.

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<>(); // Create a HashSet to store integers
        s.add(5);
        s.add(6);
        s.add(46);
        s.add(60);
        s.add(9);
        s.add(6); // Duplicate value, will be ignored
        System.out.println(s); // Print the HashSet
    }
}

Output:

[5, 6, 9, 60, 46]

Description: This code demonstrates the use of a `HashSet` to store a collection of unique integers. Duplicate values are automatically removed from the set.