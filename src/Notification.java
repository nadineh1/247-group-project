import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Sends reminders for assignments that are due soon.
 */

public class Notification implements Reminder {

    // Implement reminder method
    @Override
    public void sendReminder(Assignment assignment) {
        LocalDate today = LocalDate.now();
        // Calculate days left
        long daysLeft = ChronoUnit.DAYS.between(today, assignment.getDueDate());

        // If reminder is close enough then it will show reminder
        if (daysLeft <= assignment.getReminderDays()) {
            System.out.println("Reminder: " + assignment.getName() + " is due on " + assignment.getDueDate() + ".");
        }
    }
}