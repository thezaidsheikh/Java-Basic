
/**
 * DateTime:
 * A combination of date and time.
 * It is a complex data type that stores both date and time values.
 * It is used to store and manipulate date and time values.
 *
 * Memory Management:
 * DateTime is a compound data type that is stored in memory.
 * It is stored in the heap section of memory.
 * It is created using the new keyword and is garbage collected when it goes out of scope.
 *
 * Types:
 * There are four types of DateTime:
 * 1. LocalDate: It only stores date value.
 *    Example: LocalDate d1 = LocalDate.of(2025, 6, 12);
 * 2. LocalTime: It only stores time value.
 *    Example: LocalTime t1 = LocalTime.now();
 * 3. LocalDateTime: It stores both date and time values.
 *    Example: LocalDateTime dt1 = LocalDateTime.now();
 * 4. ZonedDateTime: It stores date, time, and zone values.
 *    Example: ZonedDateTime dt2 = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
 *
 * Related Terms:
 * 1. Instant: It is a moment on the timeline in UTC.
 *    Example: Instant d1 = Instant.now();
 * 2. ZoneId: It is a time zone object.
 *    Example: ZoneId z1 = ZoneId.of("Asia/Kolkata");
 * 3. ZoneOffset: It is a time zone offset from GMT.
 *    Example: ZoneOffset z2 = ZoneOffset.of("+05:30");
 * 4. Period: It is a period of time.
 *    Example: Period p1 = Period.of(1, 2, 3);
 * 5. Duration: It is a duration of time.
 *    Example: Duration d3 = Duration.ofHours(2);
 */

import java.time.*;

public class DateTime {
    public static void main(String[] args) {
        Long d1 = Instant.now().toEpochMilli();
        System.out.println(d1);
        LocalDate d2 = LocalDate.of(2025, 6, 12);
        System.out.println(d2);
        LocalDate d3 = LocalDate.parse("2025-06-12");
        System.out.println(d3);
        LocalDate d4 = LocalDate.ofYearDay(2025, 6);
        System.out.println(d4);

        LocalTime t1 = LocalTime.now();
        System.out.println(t1);
        LocalTime t2 = LocalTime.of(2025, 6, 12);
        System.out.println(t2);
        LocalTime t3 = LocalTime.parse("2025-06-12");
        System.out.println(t3);

        LocalDate d5 = LocalDate.now();
        System.out.println(d5);
    }
}
