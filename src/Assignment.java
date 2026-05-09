import java.time.LocalDate;

public class Assignment extends Task {

    // Variables for each assignment
    private double estimatedHours;
    private int reminderDays;


    // Constructor to create Assignment object
    public Assignment(String name, LocalDate dueDate, double estimatedHours, int reminderDays) {

        // Call parent constructor first
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

    public double getEstimatedHours() {
        return estimatedHours;
    }

    public int getReminderDays() {
        return reminderDays;
    }

    // Required abstract method from Task
    @Override
    public String getPriorityLevel() {

        if (reminderDays <= 1) {
            return "High";
        } else if (reminderDays <= 3) {
            return "Medium";
        } else {
            return "Low";
        }
    }


    @Override
    public String toString() {

        return "Assignment: " + getName() + ", Due Date: " + getDueDate() + ", Estimated Hours: "
                + estimatedHours + ", Reminder: " + reminderDays + " day(s) before" + ", Priority: " + getPriorityLevel();
    }
}