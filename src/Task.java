import java.time.LocalDate;

/**
 * Abstract parent class that represents a general task.
 * Assignment inherits from this class.
 */

// Abstract class that represents a general task.
// Assignment will inherit from this class.

public abstract class Task {
    private String name;
    private LocalDate dueDate;

    public Task(String name, LocalDate dueDate) {
        this.name = name;
        this.dueDate = dueDate;
    }

    public String getName() {
        return name;
    }


    public LocalDate getDueDate() {
        return dueDate;
    }

    public abstract String getPriorityLevel();
}