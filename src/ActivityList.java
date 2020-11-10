import java.util.*;
import java.io.*;

public class ActivityList extends Activity {

    Scanner scanAddAnother = new Scanner(System.in);
    boolean addAnother;
    int amount;

    ArrayList<ArrayList> listOfActivities;
    ArrayList[] ch = {listOfActivities};

    ActivityList() {
        System.out.println();
        System.out.println("Constructor of ActivityList");
        System.out.println();
        System.out.println("You have created an Activity-List");
        System.out.println("How many Activities would you like to add to your list?");
        amount = scanAddAnother.nextInt();
        System.out.println();
    }


    public void createActivity() {

        listOfActivities = new ArrayList();

        for (int count = 0; count < amount; count++) {

            super.setName();
            super.setLocation();
            super.setDate();
            super.setDuration();
            listOfActivities.add(super.ActivityDetails);

            System.out.println(listOfActivities);
            System.out.println();
            System.out.println(ch);
            System.out.println();

            if (count == amount) {
                System.out.println("Thanks for using the ToDoList");
                System.exit(1);
            } else continue;
        }

    }


    public void saveFile()  {

        FileWriter writer;
        File listFile = new File("liste.txt");


        try{
            writer = new FileWriter(listFile, true);
            writer.write("a");
            writer.write(System.getProperty("line.separator"));

            writer.flush();
            writer.close();
        }
        catch (IOException ex) {ex.printStackTrace();}
    }

} //close class
