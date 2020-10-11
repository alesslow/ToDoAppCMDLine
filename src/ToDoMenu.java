import java.io.*;
import java.util.*;

public class ToDoMenu implements Serializable {
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
    int one = 1;
    int two = 2;
    int three = 3;

    public void startToDoList() {
        System.out.println("'Welcome to the ToDo List'");
        System.out.println();
        this.promptListType(true);

        if (listType == 1){
            this.selectActivityList();
        }
        if (listType == 2) {
            this.selectGroceryList();
        }
        if (listType == 3) {
            this.selectShoppingList();
        }
    }

    public void promptListType(boolean promptListType) {
        if (promptListType == true) {
            System.out.println("What kind of List would you like to create?");

            System.out.println("1. a normal List of Activities?");
            System.out.println("2. a Grocery List?");
            System.out.println("3. a shopping List?");
            System.out.println();
            System.out.println("select by pressing a number");
            listType = scanListType.nextInt();

            System.out.println();
            System.out.println();
        }
    }


    public void selectActivityList() {
        new ActivityList().createActivity();
    }

    public void selectGroceryList() {
        new GroceryList().setStore();
    }

    public void selectShoppingList() {
        new ShoppingList();
    }



}

