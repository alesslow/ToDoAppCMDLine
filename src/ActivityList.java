import java.util.*;
import java.io.*;

public class ActivityList extends Activity {

    Scanner scanAddAnother = new Scanner(System.in);
    boolean addAnother;

    ArrayList<ArrayList> listOfActivities;



    ActivityList() {
        System.out.println();
        //  listOfActivities = new ArrayList();
        System.out.println("Constructor of ActivityList");
        System.out.println("You have created an ActivityList");
        System.out.println();
    }


    public void createActivity() {

        listOfActivities = new ArrayList();

        for (int count = 0; count < 3; count++) {

            super.setName();
            super.setLocation();
            super.setDate();
            super.setDuration();

            listOfActivities.add(super.ActivityDetails);
            System.out.println(listOfActivities);
            System.out.println();
            System.out.println();

            if (count < 2) {
                System.out.println("Would you like to add another Activity?");
              if (scanAddAnother.hasNext("yes")){
              }
              else {
                      System.out.println("Thanks for using the ToDoList");
                      System.exit(1);
              }
            }

            }



        //}


    } //close class}
}
