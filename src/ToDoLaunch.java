import java.io.*;
import java.util.*;

public class ToDoLaunch {

    public static void main(String[]args) {

         Activity activity = new Activity();
         activity.createActivity();

         System.out.println(activity.ActivityDetails);
         System.out.println();

         ArrayList<Activity> ToDoList = new ArrayList<>();
         ToDoList.add(activity);
         System.out.println();
         System.out.println(ToDoList);
    }

}
