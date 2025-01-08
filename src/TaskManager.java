import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TaskManager {

    private List<Task> listOfAllTasks;
    private HashMap<String, Task> myMap;

    TaskManager() {
        listOfAllTasks = new ArrayList<>();
        myMap = new HashMap<>();
    }


    public Task getTask(String title) {
        return myMap.get(title);
    }

    public Task getTaskByIndex(int index) {
       return listOfAllTasks.get(index);
    }


    public void addTask(Task task) {
        listOfAllTasks.add(task);
            System.out.println("Task added: " + task.getTitle());
            myMap.put(task.getTitle(), task);
        }

    public void viewTasks() {
        for (Task task : listOfAllTasks) {
            task.displayTask();
            System.out.println("HashMap: " + myMap.toString());
        }
    }


    public void removeTaskByIndex(int taskId) {
        listOfAllTasks.remove(taskId);
    }

    public void markTaskCompleted(int taskId) {
    }

}

