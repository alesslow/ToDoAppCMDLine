import java.awt.*;
import java.io.*;
import java.util.*;

public class ListMenu implements Serializable {

    Scanner scanListType = new Scanner(System.in);
    public int listType;

    // Opens the list-selection menu
    public void openListSelection() {

        System.out.println();
        System.out.println("What kind of List would you like to create?");
        System.out.println("1. a ToDoList");
        System.out.println("2. an Activity List?");
        System.out.println();
        System.out.println("select by pressing a number");
        try {
            listType = scanListType.nextInt();
            selectListType(listType);
        } catch (InputMismatchException | IOException ex) {
            System.out.println("Invalid Input. Enter a number");
            listType = 0;
        }
        if (listType == 0) {
        }

        System.out.println();
        System.out.println();
    }

        public void selectListType(int listType) throws IOException {
            if (listType == 1) {
                this.selectToDoList();
            }
            if (listType == 2) {
                this.selectActivityList();
            }
        }

    public void selectToDoList() throws IOException {
        new ToDoList().setListOfTasks();
    }

    public void selectActivityList() {
        new ActivityList().createActivity();
    }

} //close class

