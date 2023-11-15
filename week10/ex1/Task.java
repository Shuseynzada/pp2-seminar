package week10.ex1;

public class Task implements Comparable<Task> {
    private String name;
    private int priority, duration;

    public Task(String name, int priority, int duration) {
        this.name = name;
        this.priority = priority;
        this.duration = duration;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public int getDuration() {
        return duration;
    }

    // Setters
    public void setName(String s) {
        this.name = s;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public static Task stringToTask(String s) {
        String[] entries = s.split(",");
        return new Task(entries[0], Integer.parseInt(entries[1]), Integer.parseInt(entries[2]));
    }

    public String toString() {
        return this.name + ":  priority: " + this.priority + ", duration: " + this.duration;
    }

    @Override
    public int compareTo(Task o) {
        return this.priority - o.getPriority();
    }
}
