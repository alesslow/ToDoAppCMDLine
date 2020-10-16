import java.util.*;

public class Activity extends Task {
    Scanner scanActivityDetails = new Scanner(System.in);

    String name;
    String location;
    String date;
    String AmPm;
    int timeOfDay;
    int duration;
    int end;
    int count;

    ArrayList ActivityDetails;

    public Task setName() {

        ActivityDetails = new ArrayList();
        System.out.println("What kind of Activity would you like to add to the List?");
        name = scanActivityDetails.nextLine();
        this.ActivityDetails.add(name);
        System.out.println("'" + name + "'" + "has been added to the List");
        System.out.println();
        return null;
    }

    public void setLocation() {
        System.out.println("Where will you go " + "'" + name + "'" + " at?");
        location = scanActivityDetails.nextLine();
        this.ActivityDetails.add(location);
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

} //close class
