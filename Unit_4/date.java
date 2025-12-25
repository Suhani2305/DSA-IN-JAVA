package Unit_4;
 
import java.time.*;
// public class date{
//     public static void main(String args[]){
//         LocalDate date = LocalDate.now();
//         LocalTime time = LocalTime.now();
//         LocalDateTime dateTime = LocalDateTime.now();
//         System.out.println("Current date: "+date);
//         System.out.println("Current time: "+time);
//         System.out.println("Current date and time: "+dateTime);

//         long c = System.currentTimeMillis();
//         System.out.println("Current time in milliseconds: "+c);

//         LocalDate date1 = LocalDate.of(2023, 10, 1);
//         LocalTime time1 = LocalTime.of(10, 30, 0);
//         LocalDateTime dateTime1 = LocalDateTime.of(date1, time1);
//         System.out.println("Date and time: "+dateTime1);
//         System.out.println("Date: "+date1);
//         System.out.println("Time: "+time1);
//         System.out.println("Year: "+date1.getYear());
//         System.out.println("Month: "+date1.getMonthValue());
//         System.out.println("Day: "+date1.getDayOfMonth());
//         System.out.println("Hour: "+time1.getHour());
//         System.out.println("Minute: "+time1.getMinute());
//         System.out.println("Second: "+time1.getSecond());
//         System.out.println("Nano: "+time1.getNano());
//         ZonedDateTime zonedDateTime = ZonedDateTime.now();
//         System.out.println("Zoned date and time: "+zonedDateTime);
//         System.out.println("Zone: "+zonedDateTime.getZone());
//         System.out.println("Offset: "+zonedDateTime.getOffset());

//         Instant now = Instant.now();
//         System.out.println("Current timestamp: "+now);
//         System.out.println("Current timestamp in milliseconds: "+now.toEpochMilli());
//     }
// }
 

// formatting and parsing date and time
import java.time.format.DateTimeFormatter;
// public class date{
//     public static void main(String args[]){
//         LocalDate date = LocalDate.now();
//         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//         String f = date.format(formatter);
//         System.out.println("Formatted date: "+f);
//         LocalDate d1 = date.plusDays(7);
//         System.out.println("Date after 7 days: "+d1);
//         LocalDate d2 = date.minusDays(7);
//         System.out.println("Date before 7 days: "+d2);
//         LocalDate d3 = date.plusWeeks(2);
//         System.out.println("Date after 2 weeks: "+d3);
//         LocalDate d4 = date.minusWeeks(2);
//         System.out.println("Date before 2 weeks: "+d4);
//         LocalDate d5 = date.plusMonths(2);
//         System.out.println("Date after 2 months: "+d5);
//         LocalDate d6 = date.minusMonths(2);
//         System.out.println("Date before 2 months: "+d6);
//         LocalDate d7 = date.plusYears(2);
//         System.out.println("Date after 2 years: "+d7);
//         LocalDate d8 = date.minusYears(2);
//         System.out.println("Date before 2 years: "+d8);
//         LocalDate d9 = date.plusDays(7).plusWeeks(2).plusMonths(2).plusYears(2);
//         System.out.println("Date after 7 days, 2 weeks, 2 months and 2 years: "+d9);
//         LocalDate d10 = date.minusDays(7).minusWeeks(2).minusMonths(2).minusYears(2);
//         System.out.println("Date before 7 days, 2 weeks, 2 months and 2 years: "+d10);

//     }
// }


public class date{
    public static void main(String args[]){
        LocalDate d1 = LocalDate.of(2023, 4, 1);
        LocalDate d2 = LocalDate.of(2093, 10, 31);
        Period  p = Period.between(d1,d2);
        System.out.println("Difference between two dates: "+p.getDays()+" days, "+p.getMonths()+" months, "+p.getYears()+" years");
    }
}