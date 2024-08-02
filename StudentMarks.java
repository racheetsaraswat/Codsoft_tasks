import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of subjects: ");
        int n = scanner.nextInt();
        int[] marks = new int[n];

        System.out.println("Enter marks out of 100 for each subject:");
        for (int i = 0; i < n; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        double averagePercentage = totalMarks / (double) n;

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

        System.out.println("Results:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println(String.format("Average Percentage: %.2f%%", averagePercentage));
        System.out.println("Grade: " + grade);

        scanner.close();

    }
}