import java.util.*;
import java.io.*;

public class ActivityList extends Activity {

    Scanner scanAddAnother = new Scanner(System.in);

    ArrayList ActivityDetails;


        ActivityList() {
            System.out.println();
            System.out.println("Constructor of ActivityList");
            System.out.println("You have created an ActivityList");
            System.out.println();
        }


    public void createActivity(){

        System.out.println();
        System.out.println();
        System.out.println();
        this.setName();
        this.setLocation();
        this.setDate();
        this.setDuration();

        System.out.println(ActivityDetails);
        System.out.println();
        System.out.println("Would you like to add another Activity?");

        if (scanAddAnother.nextLine().contains("yes")){
            System.out.println(ActivityDetails);
            addAnother = true;
            System.out.println();
          //  createActivity();
            this.setName();
        } else {
            addAnother = false;
        }
        if (addAnother = false){
            System.out.println(ActivityDetails);
            System.out.println("Thanks for using the ToDo List");
          //  System.exit(1);
          //  Runtime.getRuntime().exit(1);
        }


    }

    public void setName() {

        ActivityDetails = new ArrayList();
        System.out.println("What kind of Activity would you like to add to the List?");
        name = scanActivityDetails.nextLine();
        ActivityDetails.add(name);
        System.out.println("'" + name + "'" + "has been added to the List");
        System.out.println();
    }

    public void setLocation() {
            System.out.println("Where will you go " + "'" + name + "'" + " at?");
            location = scanActivityDetails.nextLine();
            ActivityDetails.add(location);
            System.out.print("'" + name + "' " + "will take place at " + "'" + location + "'");
            System.out.println();
            System.out.println();
        }

    public void setDate() {
        System.out.println("When?");
        date = scanActivityDetails.nextLine();
        timeOfDay = scanActivityDetails.nextInt();
        AmPm = scanActivityDetails.next();
        ActivityDetails.add(date);
        ActivityDetails.add(timeOfDay + AmPm);
        System.out.println();
        System.out.println("The date and time of " + "'" + name + "'" + " at " + "'" + location + "'" + " are");
        System.out.println(date);
        System.out.println(timeOfDay + AmPm);
        System.out.println();
        System.out.println();
    }

    public void setDuration() {
            System.out.println("What's the duration of the Activity?");
            duration = scanActivityDetails.nextInt();
            if (duration > 1) {
                ActivityDetails.add(duration + " hours");
            } else
                {
                    ActivityDetails.add(duration + " hour");
                }

            if (duration > 1) {
            System.out.println(name + " at " + location + " on the " +
                    date + " at " + timeOfDay + AmPm + " and will take " +
                    duration + " hours");
            } else
                {
                    System.out.println(name + " at " + location + " on the " +
                            date + " at " + timeOfDay + AmPm + " and will take " +
                            duration + " hour");
                }

            end = duration + timeOfDay;
            System.out.println();



                System.out.println(name);
                System.out.println(location);
                System.out.println(date);
                System.out.println(timeOfDay + AmPm);
                System.out.println(duration + " hour duration");

                if (AmPm.contains("am")) {
                    System.out.println("ends at " + end + "am");
                    ActivityDetails.add("ends at " + end + "am");
                } else {
                    System.out.println("ends at " + end + "pm");
                    ActivityDetails.add("ends at " + end + "pm");
                }
                System.out.println();

            }

}

