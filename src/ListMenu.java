import java.awt.*;
import java.io.*;
import java.util.*;

public class ListMenu implements Serializable {


    Scanner scanListType = new Scanner(System.in);
    public int listType;

    public void openListSelection() {
        System.out.println();
        System.out.println("What kind of List would you like to create?");

        System.out.println("1. a ToDoList");
        System.out.println("2. a Grocery List?");
        System.out.println("3. a shopping List?");
        System.out.println("5. a normal List of Activities?");
        System.out.println();
        System.out.println("select by pressing a number");

        try {
            listType = scanListType.nextInt();
            selectListType(listType);
        } catch (InputMismatchException ex) {
            System.out.println("Invalid Input. Enter a number");
            listType = 0;
        }
        if (listType == 0) {
           // MenuReturner menuReturner = new MenuReturner();
          //  menuReturner.returnToMenu();
            //  listType = scanListType.nextInt();
            // System.out.println("Back to Menu?");
            //System.out.println(listType);
            //selectListType(listType);
        }

        System.out.println();
        System.out.println();
    }

        public void selectListType(int listType) {
            if (listType == 1) {
                this.selectToDoList();
            }
            if (listType == 2) {
                this.selectGroceryList();
            }
            if (listType == 3) {
                this.selectShoppingList();
            }
            if (listType == 5) {
                this.selectActivityList();
            }
        }

    public void selectToDoList() {
        new ToDoList().addTasks();
    }

    public void selectActivityList() {
        new ActivityList().createActivity();
    }

    public void selectGroceryList() {
        new GroceryList().setStore();
    }

    public void selectShoppingList() {
     //   new ShoppingList().returnToMenu();
    }

} //close class

