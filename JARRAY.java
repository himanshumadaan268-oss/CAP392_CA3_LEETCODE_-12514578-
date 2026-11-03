import java.util.Scanner;

public class JArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Jagged array for 5 students
        int[][] marks = new int[5][];

        // Different number of subjects
        marks[0] = new int[5];  // Student 1 - 5 subjects
        marks[1] = new int[3];  // Student 2 - 3 subjects
        marks[2] = new int[2];  // Student 3 - 2 subjects
        marks[3] = new int[4];  // Student 4 - 4 subjects
        marks[4] = new int[1];  // Student 5 - 1 subject

        // Taking marks as input
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");

            for (int j = 0; j < marks[i].length; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
            }
        }

        // Displaying marks
        System.out.println("\nMarks of all students:");

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");

            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}