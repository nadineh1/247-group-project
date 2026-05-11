import java.time.LocalDate;

/**
 * Represents a school assignment with a due date,
 * estimated study hours, and reminder settings.
 */

// Inheritance: Assignment extends Task
public class Assignment extends Task {

    // Variables for each assignment
    private double estimatedHours;
    private int reminderDays;

    // Constructor
    public Assignment(String name, LocalDate dueDate, double estimatedHours, int reminderDays) {

        super(name, dueDate);

        this.estimatedHours = estimatedHours;
        this.reminderDays = reminderDays;
    }

    // Overloaded constructor
    public Assignment(String name, LocalDate dueDate, double estimatedHours) {

        super(name, dueDate);

        this.estimatedHours = estimatedHours;

        // Default reminder value
        this.reminderDays = 1;
    }

    // Getter methods
    public double getEstimatedHours() {
        return estimatedHours;
    }

    public int getReminderDays() {
        return reminderDays;
    }

    // Required abstract method from Task
    // Method overriding from Task class
    @Override
    public String getPriorityLevel() {

        if (reminderDays <= 1) {
            return "High";
        }

        else if (reminderDays <= 3) {
            return "Medium";
        }

        else {
            return "Low";
        }
    }

    // Method overriding from Task class
    @Override
    public String toString() {

        return "Assignment: " + getName()
                + ", Due Date: " + getDueDate()
                + ", Estimated Hours: " + estimatedHours
                + ", Reminder: " + reminderDays + " day(s) before"
                + ", Priority: " + getPriorityLevel();
    }
}