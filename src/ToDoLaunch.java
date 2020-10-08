import java.io.*;
import java.util.*;

public class ToDoLaunch {


    public static void main(String[]args) {

         Activity activity1 = new Activity();
         activity1.createActivity();

         Activity activity2 = new Activity();
         activity2.createActivity();

         System.out.println(activity1.ToDoList);
         System.out.println();
         System.out.println(activity2.ToDoList);

    }
}
