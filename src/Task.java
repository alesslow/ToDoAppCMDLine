import java.io.*;
import java.util.*;

public class Task {
    Scanner scanTaskDetails = new Scanner(System.in);

    String name;
    double date;
    int priority;

    public void setName() {
        name = scanTaskDetails.nextLine();

    }

    public void setDate() {
        date = scanTaskDetails.nextInt();
    }

    public void setTaskPriority() {
        priority = scanTaskDetails.nextInt();
    }

    public void printTaskDetails() {
        System.out.println(name);
        System.out.println(date +".");
        System.out.println(priority);
    }



    public String getName(String taskName) {
        return taskName;
    }

}
