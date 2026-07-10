import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate locDate = LocalDate.now(); // 1
        LocalTime locTime = LocalTime.now();// 2
        LocalDateTime locDT = LocalDateTime.now(); // 3
        System.out.println("Time : " + locTime); // 1
        System.out.println("Date : " + locDate); // 2
        System.out.println(locDT); // 3 
        LocalDateTime ldt = LocalDateTime.now(); // 4
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("E,dd/mm/yyyy \n HH:mm:ss"); // 5
        String formattedDate = ldt.format(dtf);// 4
        System.out.println(formattedDate); //4

    }
}
