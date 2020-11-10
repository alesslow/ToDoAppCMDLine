import java.io.*;
import java.util.*;

public class LaunchApp extends GUI {

    LaunchApp(String title) {
        super(title);
    }

    public static void main(String[] args) {
        GUI gui = new GUI("bak");
        gui.buildGUI();
        //ListMenu startMenu = new ListMenu();
       // startMenu.openListSelection();
       // ActivityList ac = new ActivityList();
      //  ac.createActivity();
       // ac.saveFile();


    }
}
