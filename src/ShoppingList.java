
public class ShoppingList extends MenuReturner implements Item {

    ShoppingList(){
        System.out.println();
        System.out.println("Constructor of ShoppingList");
        System.out.println("You have created a ShoppingList");
        System.out.println();
    }

    public void returnToMenu() {
            startToDoList();
        }
    }
 //close class
