import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks obtained in each subject
        System.out.println("Enter marks obtained (out of 100) in each subject:");
        int numSubjects = 0;
        int totalMarks = 0;
        while (true) {
            System.out.print("Subject " + (numSubjects + 1) + " marks: ");
            int marks = scanner.nextInt();
            if (marks < 0 || marks > 100) {
                System.out.println("Marks should be between 0 and 100.");
                continue;
            }
            totalMarks += marks;
            numSubjects++;
            System.out.print("Enter marks for another subject? (yes/no): ");
            String choice = scanner.next().toLowerCase();
            if (choice.equals("no")) {
                break;
            }
        }

        // Calculate total marks and average percentage
        double averagePercentage = (double) totalMarks / numSubjects;

        // Grade Calculation
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display Results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
