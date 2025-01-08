public abstract class Task {

    int id;
    String title;
    String description;
    boolean completed;

Task(int id, String title, String description) {
    this.id = id;
    this.title = title;
    this.description = description;

}


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public abstract void displayTask();


}
