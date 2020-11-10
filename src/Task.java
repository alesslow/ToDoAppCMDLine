import java.util.*;

public class Task {

    ArrayList taskDetails;

        Scanner scanDetails = new Scanner(System.in);
        String name;
        double date;
        int priority;
        int count;

        String[] tasks = new String[]{name};
        ArrayList<Task> listOfTasks = new ArrayList<>();
        Task [] myTasks = new Task[count];
        ArrayList mytasks = new ArrayList();


    public void addTask() {

        System.out.println("Enter a Task");
        name = scanDetails.nextLine();
        System.out.println(name + " was added to the list.");
        mytasks.add(name);
        System.out.println();

    }

        public Task setTaskName() {
            System.out.println();
            System.out.println("Enter Name of Task");
            name = scanDetails.nextLine();
            taskDetails.add(name);
            return this;
        }

        public void setDate() {
            System.out.println();
            System.out.println("Enter Date of Task");
            date = scanDetails.nextInt();
            taskDetails.add(date);

        }

        public void setTaskPriority(int priority) {

            System.out.println();
            System.out.println("Enter Priority");
            priority = scanDetails.nextInt();
            taskDetails.add(priority);

        }

        public void printTaskDetails() {
            System.out.println(name);
            System.out.println(date + ".");
            System.out.println(priority);
            System.out.println(taskDetails);
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
