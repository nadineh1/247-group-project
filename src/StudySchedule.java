import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Manages assignments by sorting them
 * and calculating daily study workload.
 */

public class StudySchedule {
    private ArrayList<Assignment> assignments;

    // Constructor
    public StudySchedule(ArrayList<Assignment> assignments) {
        this.assignments = assignments;
    }

    // Sort assignments so the nearest due date is first
    public void sortAssignmentsByDueDate() {
        Collections.sort(assignments, Comparator.comparing(Assignment::getDueDate));
    }

    public void displayAssignmentSummary() {
        System.out.println("\n- ASSIGNMENT SUMMARY -");
        for (Assignment assignment : assignments) {
            System.out.println(assignment);
            System.out.println( );
        }
    }

    // Calculate study hours per day
    public void displayDailyWorkload() {
        System.out.println("\n- DAILY STUDY WORKLOAD -");
        LocalDate today = LocalDate.now();

        for (Assignment assignment : assignments) {
            // Find number of days until due date
            long daysLeft = ChronoUnit.DAYS.between(today, assignment.getDueDate());

            // Prevent dividing by zero
            if (daysLeft <= 0) {
                daysLeft = 1;
            }

            double dailyHours = assignment.getEstimatedHours() / daysLeft;

            System.out.printf("%s -> %.2f hour(s) per day for the next %d day(s)%n",
                    assignment.getName(), dailyHours, daysLeft);
        }
    }

    public ArrayList<Assignment> getAssignments() {
        return assignments;
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 85678fe32d027abcc0ad39bafd1001c9872b5dd9
