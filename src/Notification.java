import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Notification implements Reminder {

    @Override
    public void sendReminder(Assignment assignment) {
        LocalDate today = LocalDate.now();
        long daysLeft = ChronoUnit.DAYS.between(today, assignment.getDueDate());

        if (daysLeft <= assignment.getReminderDays()) {
            System.out.println("Reminder: " + assignment.getName() + " is due on " + assignment.getDueDate() + ".");
        }
    }
}