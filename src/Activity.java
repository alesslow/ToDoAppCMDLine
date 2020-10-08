import java.util.*;
import java.io.*;

public class Activity {
    Scanner setActivityName = new Scanner(System.in);
    Scanner setActivityLocation = new Scanner(System.in);
    Scanner setActivityDate = new Scanner(System.in);
    Scanner setActivityDuration = new Scanner(System.in);
    Scanner setActivityAmPm = new Scanner(System.in);

    ArrayList ToDoList;
    String name;
    String location;
    String dateDay ;
    String timeOfDay;
    int duration;
    int end;

    public void setActivity() {

        ToDoList = new ArrayList();
        System.out.println("What kind of Activity would you like to add to the List?");
        name = setActivityName.nextLine();
        ToDoList.add(name);
        System.out.println("'" + name + "'" + "has been added to the List");

        
        System.out.println();

        System.out.println("At what Location will this Activity take place?");
        location = setActivityLocation.nextLine();
        ToDoList.add(location);
        System.out.print("'" + name + "' " + "will take place at " + "'" + location + "'");
        System.out.println();

        System.out.println();

        System.out.println("At what date and time?");
        dateDay = setActivityDate.nextLine();
        timeOfDay = setActivityDate.nextLine();
        ToDoList.add(dateDay + timeOfDay);
        System.out.println();
        System.out.println("The date and time of " + "'" + name + "'" + " at " + "'" + location + "'" + " are");
        System.out.println(dateDay);
        System.out.println(timeOfDay);

        System.out.println();

        System.out.println("What's the duration of the Activity?");
        duration = setActivityDuration.nextInt();
        ToDoList.add(duration);

    }

}
