import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Study Schedule Program!");

        // Creates object to get user input
        UserInput userInput = new UserInput();
        // Store assignments inside an ArrayList
        ArrayList<Assignment> assignments = userInput.getAssignments();

        // Create StudySchedule using assignment list
        StudySchedule schedule = new StudySchedule(assignments);
        schedule.sortAssignmentsByDueDate();
        schedule.displayAssignmentSummary();
        schedule.displayDailyWorkload();

        // Creates reminder object
        Notification notification = new Notification();

        System.out.println("\n- REMINDERS -");

        // Loop through each assignment and print reminders
        for (Assignment assignment : schedule.getAssignments()) {
            notification.sendReminder(assignment);
        }

        System.out.println("\nThank you for using the Study Schedule Program!");
    }
}