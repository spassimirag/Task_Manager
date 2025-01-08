public class UrgentTask extends Task implements Completable {

   private int priorityLevel;

    public UrgentTask(int id, String title, String description, int priorityLevel) {
        super(id, title, description);
        this.priorityLevel = priorityLevel;

    }

    @Override
    public void displayTask() {
        System.out.println("TaskID " + this.id + " Summary: " + this.title +
                " Description: " + this.description + " Priority Level: " + this.priorityLevel);

    }

    @Override
    public void markCompleted() {
        this.completed = true;
        System.out.println("Level 1 priority task completed");

    }
}
