import java.util.*;

public class Task {

    ArrayList taskDetails;

        Scanner scanDetails = new Scanner(System.in);
        String name;
        double date;
        int priority;
        // ArrayList taskDetails

        public Task setName() {
            System.out.println();
            System.out.println("Enter Name of Task");
            name = scanDetails.nextLine();
            return this;
        }

        public void setDate() {
            System.out.println();
            System.out.println("Enter Date of Task");
            date = scanDetails.nextInt();
        }

        public void setTaskPriority() {
            System.out.println();
            System.out.println("Enter Priority");
            priority = scanDetails.nextInt();
        }

        public void printTaskDetails() {
            System.out.println(name);
            System.out.println(date + ".");
            System.out.println(priority);
        }


        public  String getName() {
            return name;
        }

        public int getPriority() {
            return priority;
        }

        public double getDate() {
            return date;
        }

}
