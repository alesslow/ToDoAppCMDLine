import java.util.*;

public class ToDoList {

    String name;
    int count;
    ArrayList<Task> listOfTasks;
    Task [] myTasks = new Task[5];

    public void taskAppearance() {
        System.out.println("Hey im a Task");
    }

    public void addTasks () {
        for (int i = 0; i<3; i++) {
            System.out.println("Hey set name for Task " + i);
            myTasks[i] = new Task().setName();
        }
    }

    public void printOutTasks() {
        System.out.println(myTasks[1].name);
    }
}
