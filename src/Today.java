import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Today {
    public static void print(){
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Not formatted date/time: " + currentDateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime);
        }
}
