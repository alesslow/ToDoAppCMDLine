import java.io.*;
import java.util.*;

public class ToDoMenu implements Serializable {

    Scanner scanListType = new Scanner(System.in);
    public int listType;

    public void startToDoList() {
        System.out.println("'Welcome to the ToDo List'");
        System.out.println();
        System.out.println("What kind of List would you like to create?");

        System.out.println("1. a normal List of Activities?");
        System.out.println("2. a Grocery List?");
        System.out.println("3. a shopping List?");
        System.out.println();
        System.out.println("select by pressing a number");
        listType = scanListType.nextInt();

        System.out.println();
        System.out.println();

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

