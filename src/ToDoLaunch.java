import java.io.*;
import java.util.*;

public class ToDoLaunch {

    public static void main(String[] args) {

        ToDoMenu toDoMenu = new ToDoMenu();
        System.out.println("'Welcome to the ToDo List'");
        toDoMenu.startToDoList();


        ArrayList<ArrayList> ToDoList = new ArrayList<>();
        System.out.println();
        System.out.println(ToDoList);
    }
}
