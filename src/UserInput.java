import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
    private Scanner scanner;

    public UserInput() {
        scanner = new Scanner(System.in);
    }

    public ArrayList<Assignment> getAssignments() {
        ArrayList<Assignment> assignments = new ArrayList<>();
        int numAssignments = 0;

        while (true) {
            try {
                System.out.print("How many assignments do you want to enter? ");
                numAssignments = scanner.nextInt();
                scanner.nextLine();

                if (numAssignments <= 0) {
                    System.out.println("Please enter a number greater than 0.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a whole number.");
                scanner.nextLine();
            }
        }

        for (int i = 0; i < numAssignments; i++) {
            System.out.println("\nEnter information for assignment #" + (i + 1));

            System.out.print("Assignment name: ");
            String name = scanner.nextLine();

            LocalDate dueDate = null;
            while (true) {
                try {
                    System.out.print("Due date (YYYY-MM-DD): ");
                    dueDate = LocalDate.parse(scanner.nextLine());
                    break;
                } catch (DateTimeParseException e) {
                    System.out.println("Invalid date format. Please use YYYY-MM-DD.");
                }
            }

            double estimatedHours = 0;
            while (true) {
                try {
                    System.out.print("Estimated hours needed: ");
                    estimatedHours = scanner.nextDouble();
                    scanner.nextLine();

                    if (estimatedHours <= 0) {
                        System.out.println("Hours must be greater than 0.");
                    } else {
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.nextLine();
                }
            }

            int reminderDays = 0;
            while (true) {
                try {
                    System.out.print("How many days before the due date do you want a reminder? ");
                    reminderDays = scanner.nextInt();
                    scanner.nextLine();

                    if (reminderDays < 0) {
                        System.out.println("Please enter 0 or a positive number.");
                    } else {
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a whole number.");
                    scanner.nextLine();
                }
            }

            Assignment assignment = new Assignment(name, dueDate, estimatedHours, reminderDays);
            assignments.add(assignment);
        }

        return assignments;
    }
}