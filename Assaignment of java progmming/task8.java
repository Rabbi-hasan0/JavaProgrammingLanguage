package assaignmentjava;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class task8 {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();
        
        DateTimeFormatter x = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String y = time.format(x);
        
        System.out.println("Current Date and Time: " + y);
    }
}
