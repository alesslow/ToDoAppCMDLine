import java.io.*;
import java.util.*;

public class ToDoLaunch {

    public static void main(String[]args) {

         ActivityList activityList = new ActivityList();
         activityList.createActivity();
         System.out.println(activityList.ActivityDetails);
         System.out.println();

         ArrayList<ArrayList> ToDoList = new ArrayList<>();
         ToDoList.add(activityList.ActivityDetails);

         System.out.println();
         System.out.println(ToDoList);
    }

}
