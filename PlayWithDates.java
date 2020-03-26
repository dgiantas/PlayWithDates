
package playwithdates;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;


public class PlayWithDates {
  
    public static void main(String[] args) {
       LocalDate today = LocalDate.now();
       System.out.println(today);
       LocalDate imerominia = LocalDate.of(2020, 3, 28);
       System.out.println(imerominia);
       LocalDate imerominia2 = LocalDate.parse("2019-05-15");
       System.out.println(imerominia2);
       
       int dayOfMonth = today.getDayOfMonth();
        System.out.println(dayOfMonth);
        
         DayOfWeek dayOfWeek = today.getDayOfWeek();
       LocalDate tomorrow = today.plusDays(1);
        System.out.println(today);
        
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String inputDate = "20-03-2020";
        LocalDate dateFromString = LocalDate.parse(inputDate, formatter);
        System.out.println("Date from String: " +dateFromString);
        
        String dateFromLocalDate = dateFromString.format(formatter);
        System.out.println("String from Local date" + dateFromLocalDate);
        
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        dateFromLocalDate =dateFromString.format(formatter2);
        System.out.println("Formatter2 : String from Local Date: " +dateFromLocalDate);
        
        
        
        
    }
    
}
