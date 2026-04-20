import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Study Schedule Program!");

        UserInput userInput = new UserInput();
        ArrayList<Assignment> assignments = userInput.getAssignments();

        StudySchedule schedule = new StudySchedule(assignments);
        schedule.sortAssignmentsByDueDate();
        schedule.displayAssignmentSummary();
        schedule.displayDailyWorkload();

        Notification notification = new Notification();

        System.out.println("\n- REMINDERS -");
        for (Assignment assignment : schedule.getAssignments()) {
            notification.sendReminder(assignment);
        }

        System.out.println("\nThank you for using the Study Schedule Program!");
    }
}