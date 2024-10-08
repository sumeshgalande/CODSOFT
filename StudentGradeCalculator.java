import java.util.Scanner;

public class StudentGradeCalculator{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter the number of subjects: ");
        int numOfSub = scanner.nextInt();
        
        int[] marks = new int[numOfSub];
        
        for (int i = 0; i < numOfSub; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = scanner.nextInt();
        }
    
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        
        double averagePercentage = (double) totalMarks / numOfSub;
        
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
        
        System.out.println("\n----- Result Summary -----");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
