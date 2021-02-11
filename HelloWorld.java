import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HelloWorld {
    public static void main (String args[]){
    	System.out.println("Hear ye: important announcement!");
        System.out.println("Hello, world!");
        System.out.println("Fair thee well, world!");
        System.out.println("Hi, Alice and Bob.");
        System.out.println("Hi, Charlie.");
        System.out.println("Hi, Denise.");
        System.out.println("Hi, Ester.");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        System.out.println(dtf.format(now));  
    }
}
