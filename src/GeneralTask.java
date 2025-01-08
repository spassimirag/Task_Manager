public class GeneralTask extends Task implements Completable {

    public GeneralTask(int id, String title, String description) {
        super(id, title, description);
    }

    @Override
    public void displayTask() {
        System.out.println("Task ID: " + this.id + " Summary: " + this.title +
                " Description: " + this.description);
    }

    @Override
    public void markCompleted() {
        this.completed = true;
        System.out.println("Task " + getTitle() + " is completed");

    }

    @Override
    public String toString() {
        return "GeneralTask{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", completed=" + completed +
                '}';
    }

}
