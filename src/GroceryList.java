import java.util.*;
import java.io.*;

public class GroceryList extends ToDoMenu {
    Scanner scanGrocery = new Scanner(System.in);
    Scanner scanStore = new Scanner(System.in);

    ArrayList Stores;
    ArrayList Groceries;

    GroceryList(){
        System.out.println();
        System.out.println("Constructor of GroceryList");
        System.out.println("You have created a GroceryList");
        System.out.println();
    }

    public void createGroceryList() {
        this.setStore();
    }

    public void setStore () {
        Stores = new ArrayList();
        System.out.println("Which stores do you want to go to?");
        Stores.add(scanStore.nextLine());
        System.out.println("You have selected to go to " + Stores);
        System.out.println();
    }


} //close class

