import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ToDoList extends Task {
    Scanner toDoScanner = new Scanner(System.in);
    String name;
    int count;
    int amount;

    String yes;

    ArrayList<Task> listOfTasks;
    Task[] myTasks = new Task[count];

    ToDoList() {
        System.out.println("You have created a normal ToDo List");
        System.out.println("How many Tasks would you like to add?");
        amount = toDoScanner.nextInt();
    }

    public void setListOfTasks () throws IOException {

        for (int count = 0; count<amount; count++) {
            this.addTask();
        }
        this.addMoreTasks();
    }
       public void addMoreTasks() throws IOException {

        if (count == 0) {
            System.out.println();
            System.out.println("Would you like to add more ?");
            System.out.println();
            yes = toDoScanner.nextLine();
            yes = toDoScanner.nextLine();

            if (yes.contains("yes")) {
                System.out.println("Enter Amount of Tasks");
                amount = toDoScanner.nextInt();
                System.out.println(amount);
                this.setListOfTasks();
            } else {
                System.out.println();
                System.out.println("Your To-Do List consists of: " + mytasks);
               // for ()
                System.out.println();
                System.out.println();
                File file = new File("C:\\Users\\aless\\IdeaProjects\\ToDoApplication");
                FileWriter writer = new FileWriter("ToDoList" + "");
                System.out.println("Thanks for using the ToDoList!");
                System.exit(1);
            }

        }
    }


    public void printOutTasks() {
        System.out.println(myTasks[1].name);
    }
}
