import java.time.LocalDate;

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
    }

    public double getEstimatedHours() {
        return estimatedHours;
    }

    public int getReminderDays() {
        return reminderDays;
    }

    @Override
    public String toString() {
        return "Assignment: " + name +
                ", Due Date: " + dueDate +
                ", Estimated Hours: " + estimatedHours +
                ", Reminder: " + reminderDays + " day(s) before";
    }
}