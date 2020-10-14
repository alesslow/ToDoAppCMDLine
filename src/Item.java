import java.util.Scanner;

public class Item {
    Scanner userInputName = new Scanner(System.in);

    String name;
    double price;

    public void setName(String name) {
        name = userInputName.nextLine();
    }
}
