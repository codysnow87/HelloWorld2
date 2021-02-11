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
        
        /* Total number of processors or cores available to the JVM */
        System.out.println("Available processors (cores): " + 
        Runtime.getRuntime().availableProcessors());

        /* Total amount of free memory available to the JVM */
        System.out.println("Free memory (bytes): " + 
        Runtime.getRuntime().freeMemory());

        /* This will return Long.MAX_VALUE if there is no preset limit */
        long maxMemory = Runtime.getRuntime().maxMemory();
        /* Maximum amount of memory the JVM will attempt to use */
        System.out.println("Maximum memory (bytes): " + 
        (maxMemory == Long.MAX_VALUE ? "no limit" : maxMemory));

        /* Total memory currently in use by the JVM */
        System.out.println("Total memory (bytes): " + 
        Runtime.getRuntime().totalMemory());
    }
}
