package java_Demo;

import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class localtimedate {
    public static void main(String[] args) {
        LocalTime current = LocalTime.now();
        System.out.println(current);

        LocalDate current1 = LocalDate.now();
        System.out.println(current1);

        LocalDateTime current2 = LocalDateTime.now();
        System.out.println(current2);

        // Format LocalDateTime using a custom pattern
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = current2.format(formatter);
        System.out.println("Formatted date/time: " + formattedDate);

        // Using a predefined format style ONLY on LocalDateTime
        DateTimeFormatter shortFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println("Short format: " + current2.format(shortFormatter));

        // If you want to format LocalTime, use a time-only formatter:
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Formatted time: " + current.format(timeFormatter));

        // If you want to format LocalDate, use a date-only formatter:
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Formatted date: " + current1.format(dateFormatter));
    }
}
