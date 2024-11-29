import java.util.Scanner;

public class FC3UCEGT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Student names
        String[] studentNames = {"Gio", "Renzo", "Leo", "Lee", "Straight"};

        // Subjects
        String[] subjects = {"CC1", "CC2", "CC7"};

        // Students' grades
        int[][] grades = new int[studentNames.length][subjects.length];

        // Input grades for each student
        for (int i = 0; i < studentNames.length; i++) {
            System.out.printf("Enter grades for %s:%n", studentNames[i]);
            for (int j = 0; j < subjects.length; j++) {
                System.out.printf("%s: ", subjects[j]);
                grades[i][j] = scanner.nextInt();
            }
        }

        // Calculate and display each student's average grade
        System.out.println("\nStudent Grades and Averages:");
        double totalAverage = 0;
        for (int i = 0; i < studentNames.length; i++) {
            int total = 0;
            System.out.printf("%s's grades:%n", studentNames[i]);
            for (int j = 0; j < subjects.length; j++) {
                total += grades[i][j];
                System.out.printf("%s: %d%n", subjects[j], grades[i][j]);
            }
            double average = (double) total / subjects.length;
            totalAverage += average;
            System.out.printf("Average Grade = %.2f%n%n", average);
        }

        // Calculate and display total average for all students
        totalAverage /= studentNames.length;
        System.out.printf("Total Average Grade for all students = %.2f%n", totalAverage);
    }
}
