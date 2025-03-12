//1 задание
import java.util.*;

class GenericMerge {
    public static <T> List<T> mergeListsAlternating(List<T> list1, List<T> list2) {
        List<T> mergedList = new ArrayList<>();
        int i = 0, j = 0;
        while (i < list1.size() || j < list2.size()) {
            if (i < list1.size()) mergedList.add(list1.get(i++));
            if (j < list2.size()) mergedList.add(list2.get(j++));
        }
        return mergedList;
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 3, 5);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);
        System.out.println(mergeListsAlternating(list1, list2));
    }
}

//2 задание
class GenericMapPrinter {
    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Map<Integer, String> map = Map.of(1, "Apple", 2, "Banana", 3, "Cherry");
        printMap(map);
    }
}

//3 задание
class Task implements Comparable<Task> {
    String taskName;
    int priority;
    int duration;

    public Task(String taskName, int priority, int duration) {
        this.taskName = taskName;
        this.priority = priority;
        this.duration = duration;
    }

    @Override
    public int compareTo(Task other) {
        if (this.priority != other.priority) {
            return Integer.compare(other.priority, this.priority); // Высший приоритет первый
        }
        return Integer.compare(this.duration, other.duration); // Меньшая длительность первая
    }

    @Override
    public String toString() {
        return "[Priority " + priority + "] " + taskName + " (Duration: " + duration + " mins)";
    }
}


public class TaskScheduler {
    private PriorityQueue<Task> taskQueue = new PriorityQueue<>();
    private Queue<Task> pendingQueue = new LinkedList<>();

    public void addTask(Task task) {
        taskQueue.offer(task);
        System.out.println("Task added: " + task);
    }

    public void processTask() {
        if (!taskQueue.isEmpty()) {
            Task task = taskQueue.poll();
            System.out.println("Processing Task: " + task);
        } else {
            System.out.println("No priority tasks left.");
        }
    }

    public void delayTask(String taskName) {
        Iterator<Task> iterator = taskQueue.iterator();
        while (iterator.hasNext()) {
            Task task = iterator.next();
            if (task.taskName.equals(taskName)) {
                iterator.remove();
                pendingQueue.offer(task);
                System.out.println("Delaying Task: " + taskName);
                return;
            }
        }
        System.out.println("Task not found.");
    }

    public void processPendingTask() {
        if (!pendingQueue.isEmpty()) {
            Task task = pendingQueue.poll();
            System.out.println("Processing Pending Task: " + task);
        } else {
            System.out.println("No pending tasks.");
        }
    }

    public void displayTasks() {
        System.out.println("\nScheduled Tasks (sorted by priority):");
        if (taskQueue.isEmpty()) {
            System.out.println("(No priority tasks)");
        } else {
            int i = 1;
            for (Task task : taskQueue) {
                System.out.println(i++ + ". " + task);
            }
        }

        System.out.println("\nPending Tasks (FIFO Order):");
        if (pendingQueue.isEmpty()) {
            System.out.println("(No pending tasks)");
        } else {
            int i = 1;
            for (Task task : pendingQueue) {
                System.out.println(i++ + ". " + task);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        scheduler.addTask(new Task("Code Review", 3, 20));
        scheduler.addTask(new Task("System Update", 5, 45));
        scheduler.addTask(new Task("Database Backup", 2, 30));
        scheduler.addTask(new Task("Deploy New Feature", 5, 50));
        scheduler.addTask(new Task("Bug Fixing", 4, 25));

        scheduler.displayTasks();

        scheduler.processTask(); 
        scheduler.delayTask("Code Review");

        scheduler.displayTasks();

        scheduler.delayTask("Database Backup");

        scheduler.displayTasks();

        scheduler.processTask(); 
        scheduler.displayTasks();

        scheduler.processTask(); 
        scheduler.displayTasks();

        scheduler.processPendingTask();  
        scheduler.displayTasks();

        scheduler.processPendingTask();  
        scheduler.displayTasks();
    }
}


