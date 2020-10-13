import java.util.*;
import java.io.*;

public class ActivityList extends Activity {

    Scanner scanAddAnother = new Scanner(System.in);
    boolean addAnother;

    ArrayList listOfActivities;

        ActivityList() {
            System.out.println();
            System.out.println("Constructor of ActivityList");
            System.out.println("You have created an ActivityList");
            System.out.println();
        }


    public void createActivity(){
        listOfActivities = new ArrayList();
        new Activity();
        System.out.println();
        System.out.println();
        this.setName();
        this.setLocation();
        this.setDate();
        this.setDuration();

        System.out.println(ActivityDetails);
        listOfActivities.add(ActivityDetails);

        System.out.println("Would you like to add another Activity?");
        if (scanActivityDetails.hasNext("yes")) {
            createActivity();
            addAnother = true;
        } else {
            System.out.println("Thanks for using the ToDoList");
        }
    }

}

