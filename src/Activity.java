import java.util.*;
import java.io.*;

public class Activity implements Serializable {
    Scanner scanActivityName = new Scanner(System.in);
    Scanner scanActivityLocation = new Scanner(System.in);
    Scanner scanActivityDate = new Scanner(System.in);
    Scanner scanActivityDuration = new Scanner(System.in);
    Scanner scanAddAnother = new Scanner(System.in);

    ArrayList ActivityDetails;
    String name;
    String location;
    String dateDay;
    String AmPm;
    int timeOfDay;
    int duration;
    int end;
    boolean addAnother;



    public void createActivity(){
        Activity activity = new Activity();
        activity.setName();
        activity.setLocation();
        activity.setDate();
        activity.setDuration();

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Would you like to add another Activity?");

        if (scanAddAnother.nextLine().contains("yes")){
            addAnother = true;
            System.out.println();
            createActivity();
        } else {
            addAnother = false;
        }
        if (addAnother = false){
            System.out.println("Thanks for using the ToDo List");
            System.exit(1);
          //  Runtime.getRuntime().exit(1);
        }


    }

    public void setName() {

        ActivityDetails = new ArrayList();
        System.out.println("What kind of Activity would you like to add to the List?");
        name = scanActivityName.nextLine();
        ActivityDetails.add(name);
        System.out.println("'" + name + "'" + "has been added to the List");
        System.out.println();
    }

    public void setLocation() {

            System.out.println("Where will you go " + "'" + name + "'" + " at?");
            location = scanActivityLocation.nextLine();
            ActivityDetails.add(location);
            System.out.print("'" + name + "' " + "will take place at " + "'" + location + "'");
            System.out.println();
            System.out.println();
        }

    public void setDate() {
        System.out.println("At what date and time?");
        dateDay = scanActivityDate.nextLine();
        timeOfDay = scanActivityDate.nextInt();
        AmPm = scanActivityDate.next();
        ActivityDetails.add(dateDay);
        ActivityDetails.add(timeOfDay);
        ActivityDetails.add(AmPm);
        System.out.println();
        System.out.println("The date and time of " + "'" + name + "'" + " at " + "'" + location + "'" + " are");
        System.out.println(dateDay);
        System.out.println(timeOfDay + AmPm);
        System.out.println();
        System.out.println();
    }

    public void setDuration() {
            System.out.println("What's the duration of the Activity?");
            duration = scanActivityDuration.nextInt();
            ActivityDetails.add(duration);

            System.out.println(name + " at " + location + " on the " +
                    dateDay + " at " + timeOfDay + AmPm + " and will take " +
                    duration + " hours");

            end = duration + timeOfDay;
            System.out.println();

            if (ActivityDetails.contains(duration)) {

                System.out.println(name);
                System.out.println(location);
                System.out.println(dateDay);
                System.out.println(timeOfDay + AmPm);
                System.out.println(duration + " hour duration");

                if (AmPm.contains("am")) {
                    System.out.println("ends at " + end + "am");
                } else {
                    System.out.println("ends at " + end + "pm");
                }
                System.out.println();
            }



    }
}
