import java.io.*;
import java.util.*;

public class Task {
    Scanner scanDetails = new Scanner(System.in);

    String name;
    double date;
    int priority;

    public void setName() {
        name = scanDetails.nextLine();
    }

    public void setDate() {
        date = scanDetails.nextInt();
    }

    public void setTaskPriority() {
        priority = scanDetails.nextInt();
    }

    public void printTaskDetails() {
        System.out.println(name);
        System.out.println(date +".");
        System.out.println(priority);
    }



    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public double getDate() {
        return date;
    }


}
