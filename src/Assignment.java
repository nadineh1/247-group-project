import java.time.LocalDate;

/**
 * Represents a school assignment with a due date,
 * estimated study hours, and reminder settings.
 */

<<<<<<< HEAD
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
=======
public class Assignment {

    // Variables for each assignment
    private String name;
    private LocalDate dueDate;
    private double estimatedHours;
    private int reminderDays;

    // Constructor to create Assignment object
    public Assignment(String name, LocalDate dueDate, double estimatedHours, int reminderDays) {
        this.name = name;
        this.dueDate = dueDate;
        this.estimatedHours = estimatedHours;
        this.reminderDays = reminderDays;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public LocalDate getDueDate() {
        return dueDate;
>>>>>>> 85678fe32d027abcc0ad39bafd1001c9872b5dd9
    }

    public double getEstimatedHours() {
        return estimatedHours;
    }

    public int getReminderDays() {
        return reminderDays;
    }

<<<<<<< HEAD
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
=======
    @Override
    public String toString() {
        return "Assignment: " + name +
                ", Due Date: " + dueDate +
                ", Estimated Hours: " + estimatedHours +
                ", Reminder: " + reminderDays + " day(s) before";
>>>>>>> 85678fe32d027abcc0ad39bafd1001c9872b5dd9
    }
}