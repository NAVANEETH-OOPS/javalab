import java.util.Scanner;
public class fifteen {



        public static void main(String[] args) {
            // Create Scanner object for user input
            Scanner scanner = new Scanner(System.in);

            // Input marks from user
            System.out.print("Enter marks out of 100: ");
            int marks = scanner.nextInt();

            // Classify the result based on the marks
            if (marks >= 60) {
                System.out.println("Result: 1st Class");
            } else if (marks >= 50) {
                System.out.println("Result: 2nd Class");
            } else if (marks >= 40) {
                System.out.println("Result: Pass");
            } else {
                System.out.println("Result: Fail");
            }

            // Close the scanner
            scanner.close();
        }
    }
