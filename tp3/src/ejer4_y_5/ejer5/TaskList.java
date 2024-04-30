package ejer4_y_5.ejer5;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
class TaskList implements Iterable<Task> {
    private List<Task> tasks;
    public TaskList() {
        tasks = new ArrayList<>();
    }
    public void addTask(Task task) {
        tasks.add(task);
        tasks.sort(Comparator.comparingInt(Task::getPriority).reversed());
    }
    public void removeTask(String description) {
        tasks.removeIf(task -> task.getDescription().equalsIgnoreCase(description));
    }
    public int getTotalTasks() {
        return tasks.size();
    }
    @Override
    public Iterator<Task> iterator() {
        return tasks.iterator();
    }}