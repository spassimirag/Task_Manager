import java.util.List;
import java.util.Scanner;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread.sleep(1500);

        TaskManager taskManager = new TaskManager();
        boolean programRunning = true;

        while (programRunning) {

            Scanner scanner = new Scanner(System.in);
            int taskID = 0;
            boolean validInput = false;

            Thread.sleep(1500);
            System.out.println("What type of task are you creating? \nOption 1: General Task" + " \nOption 2: Urgent Task");
            String taskType = scanner.nextLine();

            if (taskType.equalsIgnoreCase("General Task")) {

                while (!validInput) {
                    try {
                        System.out.println("ID (please enter a number): ");
                        taskID = scanner.nextInt();
                        validInput = true;
                    } catch (Exception e) {
                        System.out.println("ID has to be a number: ");
                        scanner.nextLine();
                    }

                }
                scanner.nextLine();
                Thread.sleep(1500);
                System.out.println("Summary: ");
                String title = scanner.nextLine();
                Thread.sleep(1500);
                System.out.println("Description: ");
                String description = scanner.nextLine();
                Thread.sleep(1500);
                GeneralTask task1 = new GeneralTask(taskID, title, description);

                taskManager.addTask(task1);

            }

            else if (taskType.equalsIgnoreCase("Urgent Task")) {

                while (!validInput) {
                    try {
                        System.out.println("ID (please enter a number): ");
                        taskID = scanner.nextInt();
                        validInput = true;
                    } catch (Exception e) {
                        System.out.println("ID has to be a number: ");
                        scanner.nextLine();
                    }

                }
                scanner.nextLine();
                Thread.sleep(1500);
                System.out.println("Summary: ");
                String title = scanner.nextLine();
                Thread.sleep(1500);
                System.out.println("Description: ");
                String description = scanner.nextLine();
                Thread.sleep(1500);
                System.out.println("Enter priority level: ");
                int priorityLevel = scanner.nextInt();
                scanner.nextLine();
                GeneralTask task2 = new GeneralTask(taskID, title, description);

                taskManager.addTask(task2);

            }

            else if (taskType.equalsIgnoreCase("Stop")) {
                programRunning = false;
            }

        }
                Thread.sleep(1500);
                taskManager.viewTasks();
                taskManager.getTaskByIndex(0);
                taskManager.getTask(taskManager.getTaskByIndex(0).getTitle());
               // taskManager.removeTaskByIndex(1);

    }
}