import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {
    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();  // Get the current date and time
        System.out.println("The current date is : " + dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy");  // Define a date format
        String myDate = dt.format(df);  // Format the date using the specified format
        System.out.println("Date after formatting : " + myDate);

    }
}

Output:

The current date is : 2021-05-26T18:15:42.554864400
Date after formatting : 26.05.2021

Description: This code uses `LocalDateTime` and `DateTimeFormatter` to format the current date and time according to a custom pattern ("dd.MM.yyyy").

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {
    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();  // Get the current date and time

        DateTimeFormatter df = DateTimeFormatter.ISO_LOCAL_DATE;  // Use the ISO format for date
        String myDate = dt.format(df);  // Format the date in ISO format
        System.out.println("Date in ISO format: " + myDate);

    }
}

Output:

Date in ISO format: 2021-05-26

Description: This code formats the current date and time using the ISO local date format.

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {
    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();  // Get the current date and time

        DateTimeFormatter df = DateTimeFormatter.ISO_WEEK_DATE;  // Use the ISO week date format
        String myDate = dt.format(df);  // Format the date in ISO week date format
        System.out.println("Date in ISO_WEEK_DATE Format: " + myDate);

    }
}

Output:

Date in ISO_WEEK_DATE Format: 2021-W21-3

Description: This code formats the current date and time using the ISO week date format.

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {
    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();  // Get the current date and time

        DateTimeFormatter df = DateTimeFormatter.ISO_ORDINAL_DATE;  // Use the ISO ordinal date format
        String myDate = dt.format(df);  // Format the date in ISO ordinal date format
        System.out.println("Date in ISO_ORDINAL_DATE Format: " + myDate);

    }
}

Output:

Date in ISO_ORDINAL_DATE Format: 2021-146

Description: This code formats the current date and time using the ISO ordinal date format.

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {
    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();  // Get the current date and time
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a");  // Define a custom date and time format
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;

        String myDate = dt.format(df);  // Format the date and time using the specified format
        System.out.println(myDate);

    }
}

Description: This code demonstrates various operations using `LocalDateTime` and `DateTimeFormatter` to format the current date and time according to a custom pattern ("dd/MM/yyyy -- E H:m a") and the ISO local date format. It prints both the original date and time and the formatted date and time.