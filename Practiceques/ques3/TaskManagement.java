package Practiceques.ques3;


 
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class TaskManagement {
 
    public static List<Task> taskList = new ArrayList<Task>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
 
        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine();
 
            switch (choice) {
 
                // complete the implementation here and call below given function respectively
               case 1:
               displayList();
               break;
                case 2:
                System.out.println("Enter task name:");
                String name = scanner.nextLine();
                String date = scanner.nextLine();
                String status = scanner.nextLine();
                Task task = new Task(name,date,status);
                addTaskToList(task);
                break;
                case 3 :
                System.out.println("Enter task status");
                String r = scanner.nextLine();
                String m = scanner.nextLine();
                changeTaskStatus(r, m);
                break;
                case 4:
                System.out.println("Enter the task name to delete");
                String d = scanner.nextLine();
                deleteTask(d);
                break;
                case 5 :
                System.out.println("Good Bye!");
                break;
                default:
                System.out.println("invalid");
            }
        } while (choice != 5);
 
        scanner.close();
    }
 
 
    public static void displayMenu(){
        System.out.println("Choose what you want to do from the menu below : ");
        System.out.println("Enter 1 to view the list of tasks.");
        System.out.println("Enter 2 to add a new task");
        System.out.println("Enter 3 to change the status of a task");
        System.out.println("Enter 4 to remove a task from the list");
        System.out.println("Enter 5 to Exit");
        System.out.print("Enter your choice : ");
    }
 
    public static void displayList() {
       for(Task n : taskList)
       {
        System.out.println(n);
       }
    }
 
    public static void addTaskToList(Task task) {
       taskList.add(task);
    }
 
    public static void changeTaskStatus(String taskName, String updatedStatus) {
       for(Task n : taskList)
       {
        if(n.getName().equals(taskName))
        n.setStatus(updatedStatus);
       }
    }
 
    public static void deleteTask(String taskName) {
       for(int i =0;i<taskList.size();i++)
       {
        Task n = taskList.get(i);
        if (n.getName().equals(taskName))
        taskList.remove(n);

       }
    //    if(packageMap.containsKey(packageId)){
    //         packageMap.remove(packageId);
    //    }
    }
}