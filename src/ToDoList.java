import java.io.*;
import java.util.*;

public class ToDoList implements Serializable {
    Scanner scanListType = new Scanner(System.in);

    public int listType;
    String name;
    String location;
    String date;
    String AmPm;
    int timeOfDay;
    int duration;
    int end;
    boolean addAnother;

    ToDoList() {
        System.out.println("'Welcome to the ToDo List'");
        System.out.print("This is the Contructor of ToDoList");
        System.out.println();
        System.out.println();
        System.out.println("What kind of List would you like to create?");

        System.out.println("1. a normal List of Activities?");
        System.out.println("2. a Grocery List?");
        System.out.println("3. a shopping List?");
        System.out.println();
        System.out.println("select by pressing a number");
        scanListType.nextLine();
        System.out.println();
    }
}
